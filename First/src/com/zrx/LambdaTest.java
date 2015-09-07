package com.zrx;

import org.junit.Test;

import java.io.InputStream;
import java.io.Reader;
import java.util.Arrays;

/**
 * Created by zhangrongxiang on 2015/9/5.
 *
 * @author zhangrongxiang
 */
class ConsumerDemo implements java.util.function.Consumer {
    @Override
    public void accept(Object o) {
        System.out.print(o + "---");
    }
}

public class LambdaTest {
    public static Supplier<Integer> testClosure2() {
        int i = 1;//默认final
        //i++;//编译错误
        return () -> {
            return i;
        };
    }

    public static Supplier<Integer> testClosure() {
        int i = 1;
        return new Supplier<Integer>() {
            @Override
            public Integer get() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println(e));
        Arrays.asList("a", "b", "d").forEach(new java.util.function.Consumer() {
            @Override
            public void accept(Object o) {
                System.out.print(o + "---");
            }
        });
        new Thread(() -> {
            System.out.println("LambdaTest....");
        }).start();
//        而之前的写法只能是这样子：()->{}这里代表一个函数，而非一个对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ConnmonTest...");
            }
        }).start();
        Supplier supplier = testClosure();
        Integer i = (Integer) supplier.get();
        System.out.print("i=" + i);
    }

    @Test
    public void test() {
        Eat eat = () -> {
            System.out.print("嗨，真的可以哎。。");
        };
        eat.eat();
    }

    @Test
    public void test2() {
        Eat eat2 = new LambdaTest()::test;
        eat2.eat();
    }
}

interface Eat {
    void eat();
}

class Eating {
    void eat(Eat eat) {
    }
}


interface Supplier<T> {
    T get();
}
