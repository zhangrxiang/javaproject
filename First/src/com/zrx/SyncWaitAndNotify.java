package com.zrx;

/**
 * Created by zhang on 2015/9/4.
 */
public class SyncWaitAndNotify {
    public static void main(String[] args) {
        Resource resource = new Resource();
        new Thread(new Procedure(resource)).start();
        new Thread(new Consumer(resource)).start();
    }

}

class Resource {
    private String name;
    private int count = 1;
    private boolean flag;//表示面包是否存在

    public synchronized void set(String name) {
        if (!flag)//没有
        notify();//唤醒生产线程
        this.name = name + count;
        System.out.println("生产者生产" + this.name + "----" + Thread.currentThread().getName());
        count++;
        flag = true;
        try {
            wait();//生产之后让其休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void get() {
        if (flag)//有
            notify();//唤醒
        System.out.println("消费者消费" + name + "----" + Thread.currentThread().getName());
        flag = false;
        try {
            wait();//休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Procedure implements Runnable {
    private Resource resource;

    public Procedure(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            resource.set("面包");
            i++;
        }
    }
}

class Consumer implements Runnable {
    private Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    public Consumer() {

    }

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            resource.get();
            i++;
        }
    }
}