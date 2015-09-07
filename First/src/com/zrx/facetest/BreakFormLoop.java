package com.zrx.facetest;

/**
 * Created by zhang on 2015/9/6.
 */
public class BreakFormLoop {
    public static void main(String[] args) {

//        breakLoop();
        breakLoopByFlag();
    }

    /**
     * 不加标志只能跳出一层循环
     */
    private static void breakLoopByFlag() {
        boolean flag = true;
        int j = 12;
//        for (int i = 0; i < j&&flag; i++) {
        for (int i = 0; i < j; i++) {
//            for (int k = 0; k < j; k++) {
            for (int k = 0; k < j && flag; k++) {
                if (k == 6) {
                //    flag = false;
                    System.out.print("hehe\n");
                    break;
                }
                flag = true;
            }
        }
    }

    private static void breakLoop() {
        int j = 12;
        for (int i = 0; i < j; i++) {
            ok:
            for (int k = 0; k < j; k++) {
                if (k == 6) {
                    System.out.print("hehe\n");
                    break ok;
                }
            }
        }
    }
}
