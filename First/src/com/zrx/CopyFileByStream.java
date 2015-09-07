package com.zrx;

import java.io.*;

/**
 * Created by zhang on 2015/9/4.
 */
public class CopyFileByStream {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\zhang\\IdeaProjects\\javaproject\\First\\src\\com\\zrx\\CopyFileByStream.java");
       // copyFile(file);
        copyFileByReaderAndWriter(file);
    }

    private static void copyFileByReaderAndWriter(File file) {
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(file);
            writer = new FileWriter(file.getName().replace(".java", ".txt"));
            char[] ch = new char[1024];
            int length = 0;
            while((length = reader.read(ch))!=-1){
                writer.write(ch,0,length);
                writer.flush();
            }
            System.out.print("读写完成！！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (writer!=null){
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
    }

}

    private static void copyFile(File file) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream("copy.txt");
            byte[] buffer = new byte[fileInputStream.available()];
            while (fileInputStream.read(buffer) != -1) {
                fileOutputStream.write(buffer);
            }
            System.out.print("读写成功！！");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
