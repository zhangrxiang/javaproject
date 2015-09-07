package com.zrx;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by zhang on 2015/9/3.
 */
public class GetSystemInfo {
    public static void main(String[] args) {
        /**
         * <code>java.version</code></td>
         *     <td>Java Runtime Environment version</td></tr>
         * <tr><td><code>java.vendor</code></td>
         *     <td>Java Runtime Environment vendor</td></tr>
         * <tr><td><code>java.vendor.url</code></td>
         *     <td>Java vendor URL</td></tr>
         * <tr><td><code>java.home</code></td>
         *     <td>Java installation directory</td></tr>
         * <tr><td><code>java.vm.specification.version</code></td>
         *     <td>Java Virtual Machine specification version</td></tr>
         * <tr><td><code>java.vm.specification.vendor</code></td>
         *     <td>Java Virtual Machine specification vendor</td></tr>
         * <tr><td><code>java.vm.specification.name</code></td>
         *     <td>Java Virtual Machine specification name</td></tr>
         * <tr><td><code>java.vm.version</code></td>
         *     <td>Java Virtual Machine implementation version</td></tr>
         * <tr><td><code>java.vm.vendor</code></td>
         *     <td>Java Virtual Machine implementation vendor</td></tr>
         * <tr><td><code>java.vm.name</code></td>
         *     <td>Java Virtual Machine implementation name</td></tr>
         * <tr><td><code>java.specification.version</code></td>
         *     <td>Java Runtime Environment specification  version</td></tr>
         * <tr><td><code>java.specification.vendor</code></td>
         *     <td>Java Runtime Environment specification  vendor</td></tr>
         * <tr><td><code>java.specification.name</code></td>
         *     <td>Java Runtime Environment specification  name</td></tr>
         * <tr><td><code>java.class.version</code></td>
         *     <td>Java class format version number</td></tr>
         * <tr><td><code>java.class.path</code></td>
         *     <td>Java class path</td></tr>
         * <tr><td><code>java.library.path</code></td>
         *     <td>List of paths to search when loading libraries</td></tr>
         * <tr><td><code>java.io.tmpdir</code></td>
         *     <td>Default temp file path</td></tr>
         * <tr><td><code>java.compiler</code></td>
         *     <td>Name of JIT compiler to use</td></tr>
         * <tr><td><code>java.ext.dirs</code></td>
         *     <td>Path of extension directory or directories
         *         <b>Deprecated.</b> <i>This property, and the mechanism
         *            which implements it, may be removed in a future
         *            release.</i> </td></tr>
         * <tr><td><code>os.name</code></td>
         *     <td>Operating system name</td></tr>
         * <tr><td><code>os.arch</code></td>
         *     <td>Operating system architecture</td></tr>
         * <tr><td><code>os.version</code></td>
         *     <td>Operating system version</td></tr>
         * <tr><td><code>file.separator</code></td>
         *     <td>File separator ("/" on UNIX)</td></tr>
         * <tr><td><code>path.separator</code></td>
         *     <td>Path separator (":" on UNIX)</td></tr>
         * <tr><td><code>line.separator</code></td>
         *     <td>Line separator ("\n" on UNIX)</td></tr>
         * <tr><td><code>user.name</code></td>
         *     <td>User's account name</td></tr>
         * <tr><td><code>user.home</code></td>
         *     <td>User's home directory</td></tr>
         * <tr><td><code>user.dir</code></td>
         *     <td>User's current working directory</td></tr>
         */
        Properties properties = System.getProperties();
        try {
           // properties.loadFromXML(new FileInputStream(new File("system.xml")));
            properties.storeToXML(new FileOutputStream(new File("sys.xml ")),"SYSTEM_USERl");

        } catch (IOException e) {
            e.printStackTrace();
        }

        Enumeration<?> enums =  properties.propertyNames();
        while(enums.hasMoreElements()){
            System.out.println(enums.toString());
            enums.nextElement();
        }
    }
}
