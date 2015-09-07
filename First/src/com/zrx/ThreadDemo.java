package com.zrx;

/**
 * Created by zhang on 2015/9/3.
 */
public class ThreadDemo extends Thread {
    public static void main(String[] args) {
        ThreadDemo.count();
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i <20 ; i++) {
            System.out.println(i + "------" + Thread.currentThread().getName());
        }
    }

    private static void count() {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        t1.start();
        t2.start();
    }
}
