package com.zrx.facetest;

/**
 * Created by zhang on 2015/9/6.
 */
public class StaticDemo {
    public  static  int i = 0;
    public int i2 = 0;

    public StaticDemo() {
        i++;
        i2++;
        System.out.println("静态变量 i  "+i);
        System.out.println("非静态变量 i2  "+i2);

    }
    static int getStatic(){
        System.out.println("静态变量 i  "+i);
        return i++;
    }
    int get(){
        System.out.println("非静态变量 i2  "+i2);
        return i2++;
    }
    public native void nativeM();

    public static void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        StaticDemo staticDemo1 = new StaticDemo();
        StaticDemo staticDemo2 = new StaticDemo();
        staticDemo.get();
        staticDemo1.get();
        staticDemo2.get();
        StaticDemo.getStatic();
        StaticDemo.getStatic();
        StaticDemo.getStatic();
    }
}
