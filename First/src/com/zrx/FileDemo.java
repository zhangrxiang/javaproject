package com.zrx;

import java.io.File;
import java.io.IOException;

/**
 * Created by zhang on 2015/9/3.
 */
public class FileDemo {
    public static void main(String args[]) {
        System.out.print("haha");
        System.out.println();
        caeateFile();
    }

    private static void caeateFile() {
        File file = new File("C:\\Users\\zhang\\IdeaProjects\\javaproject\\First\\src\\com\\zrx\\text.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("文件创建完成");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("文件已经存在，无需创建");
            String path = file.getAbsolutePath();
            System.out.println("这个文件的绝对路径是" + path);
            try {
                String str = file.getCanonicalPath();
                System.out.println("文件的Canonical是" + str);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String name = file.getName();
            System.out.println("文件的名字是" + name);

            String parent = file.getParent();
            System.out.println("文件的路径"+parent);
        }
    }
}
