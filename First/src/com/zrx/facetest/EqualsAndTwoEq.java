package com.zrx.facetest;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by zhang on 2015/9/6.
 */
public class EqualsAndTwoEq {
    public static void main(String[] args) {
        final StringBuilder s = null;
        s.append("111");
        s.append("1111");
        final StringBuilder stringBuilder = null;
//        stringBuilder=""; wrong,don''t give value
        String str = "abc";
        String str2 = "abc";
        out.println(str == str2);
        out.println(str.equals(str2));
        str = str2;
        out.println(str == str2);
        out.println(str.equals(str2));
        String str3 = new String("abc");
        out.println(str == str3);//false  比较地址
        out.println(str.equals(str3));

        Integer i = 2;
        int i2 = 2;
        int i3 = new Integer(2);
        out.println(i == i2);
        out.println(i.equals(i2));
        out.println(i == i3);


    }
}
