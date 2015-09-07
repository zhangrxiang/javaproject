package com.zrx;

import java.io.File;

/**
 * Created by zhang on 2015/9/4.
 */
public class DeleteDirectoryDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\zhang\\IdeaProjects\\javaproject\\First\\test");
        deleteDirectory(file);
    }

    /**
     * @param file
     */
    private static void deleteDirectory(File file) {

        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getAbsolutePath());
                f.delete();
            } else {
                deleteDirectory(f);
                System.out.println(f.getAbsolutePath());
                f.delete();
            }
        }
        file.delete();
    }
/*D:\ProgramDev\Java\jdk1.8.0_45\bin\java -Didea.launcher.port=7538 "-Didea.launcher.bin.path=D:\ProgramDev\IntelliJ IDEA 14.1.4\bin" -Dfile.encoding=UTF-8 -classpath "D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\charsets.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\deploy.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\javaws.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\jce.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\jfr.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\jfxswt.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\jsse.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\management-agent.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\plugin.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\resources.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\rt.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\access-bridge-64.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\cldrdata.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\dnsns.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\jaccess.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\jfxrt.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\localedata.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\nashorn.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\sunec.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\sunjce_provider.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\sunmscapi.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\sunpkcs11.jar;D:\ProgramDev\Java\jdk1.8.0_45\jre\lib\ext\zipfs.jar;C:\Users\zhang\IdeaProjects\javaproject\out\production\First;D:\ProgramDev\IntelliJ IDEA 14.1.4\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain com.zrx.DeleteDirectoryDemo
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\11\GetSystemInfo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\11\InnerClassDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\11\InterruptedSwing.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\11\RunnableDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\11\SynchronizedDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\11\SyncWaitAndNotify.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\11\ThreadDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\11
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\22
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\FastKeyword.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\FileDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\GetSystemInfo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\InnerClassDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\InterruptedSwing.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\RunnableDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\SynchronizedDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\SyncWaitAndNotify.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1\ThreadDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\1
C:\Users\zhang\IdeaProjects\javaproject\First\test\2\FastKeyword.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\2\FileDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\2\GetSystemInfo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\2\InnerClassDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\2\InterruptedSwing.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\2\RunnableDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\2\SynchronizedDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\2\SyncWaitAndNotify.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\2\ThreadDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\2
C:\Users\zhang\IdeaProjects\javaproject\First\test\3\FastKeyword.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\3\FileDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\3\GetSystemInfo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\3\InnerClassDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\3\InterruptedSwing.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\3\RunnableDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\3\SynchronizedDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\3\SyncWaitAndNotify.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\3\ThreadDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\3
C:\Users\zhang\IdeaProjects\javaproject\First\test\FastKeyword.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\FileDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\GetSystemInfo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\InnerClassDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\InterruptedSwing.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\RunnableDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\SynchronizedDemo.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\SyncWaitAndNotify.java
C:\Users\zhang\IdeaProjects\javaproject\First\test\ThreadDemo.java

Process finished with exit code 0
*/
}
