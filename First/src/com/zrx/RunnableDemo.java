package com.zrx;

/**
 * Created by zhang on 2015/9/3.
 */
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + "-----" + Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        t.start();
        t2.start();
    }
}
