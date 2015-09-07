package com.zrx;

import java.util.Objects;

/**
 * Created by zhang on 2015/9/4.
 * 线程演示
 */
public class SynchronizedDemo extends Thread {
    private boolean flag;

    public static void main(String[] args) {
//        SynchronizedDemo synchronizedDemo = new SynchronizedDemo(true);
//        SynchronizedDemo synchronizedDemo2 = new SynchronizedDemo(false);
//        synchronizedDemo.start();
//        synchronizedDemo2.start();
        DeadBlock deadBlock = new DeadBlock(true);
        DeadBlock deadBlock2 = new DeadBlock(false);
        new Thread(deadBlock).start();
        new Thread(deadBlock2).start();

    }

    SynchronizedDemo(boolean flag) {
        this.flag = flag;
    }

    /**
     * 线程的死锁
     */
    @Override
    public void run() {
        super.run();
        if (flag) {
            synchronized (MyLock.LockA) {
                System.out.println("if...locka...");
                synchronized (MyLock.LockB) {
                    System.out.println("if...lockb...");
                }
            }
        } else {
            synchronized (MyLock.LockB) {
                System.out.print("else...lockb---");
                synchronized (MyLock.LockA) {
                    System.out.println("else...locka---");
                }
            }
        }
    }
}

class MyLock {
    public static final Object LockA = new Object();
    public static final Object LockB = new Object();
}

class DeadBlock implements Runnable {
    private boolean flag;

    public DeadBlock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (MyLock.LockA){
                System.out.println("if.....locka");
                synchronized(MyLock.LockB){
                    System.out.println("if...lockb");

                }
            }
        }
        else{
            synchronized (MyLock.LockB){
                System.out.println("else...lockb");
                synchronized(MyLock.LockA){
                    System.out.println("else...locka");
                }
            }
        }
    }
}
