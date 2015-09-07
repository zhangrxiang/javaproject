package com.zrx;

/**
 * Created by zhang on 2015/9/3.
 */
public class InnerClassDemo {
    static class InnerClass2 {
        void count() {//静态内部类
            int i1 = 2;
            System.out.println("静态内部类");
        }
    }

    class InnerClass {//非静态内部类
        int i = 1;

        void count() {
            int i1 = 2;
            System.out.println("" + i1);
        }
    }

    public void show() {
        new InnerClass().count();
    }

    public void test() {
        InnerClassDemo.InnerClass innerClass = new InnerClassDemo().new InnerClass();
        InnerClassDemo.InnerClass innerClass2 = new InnerClass();
        innerClass.count();
    }

    public void methodClass() {
        class MethodClass {
            void print() {
                System.out.println("methodClass");
            }
        }
        new MethodClass();
    }

    public static void main(String[] args) {
        new InnerClassDemo().test();
        InnerClassDemo.InnerClass innerClass = new InnerClassDemo().new InnerClass();//访问非私有修饰的非静态内部类
        InnerClassDemo.InnerClass2 innerClass2 = new InnerClassDemo.InnerClass2();//访问非私有静态内部类
        innerClass2 = new InnerClassDemo.InnerClass2();//访问非私有静态内部类
        innerClass2.count();
    }
}
