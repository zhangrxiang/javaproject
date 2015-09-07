package com.zrx.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by zhang on 2015/9/5.
 */
public class DatabaseUtil {
    static Connection connection;
    static String url = "jdbc:oracle:thin:@localhost:1521:XE";
    static String username = "system";
    static String password = "oracle";

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "system";
        String password = "oracle";
//        Connection connection = getConnection(url,username,password);
        Connection connection = getConnection(url);
        System.out.println(connection);
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("WebApp/src/com/zrx/config.properties"));//我简直日了鬼
        } catch (IOException e) {
            e.printStackTrace();
        }
        String url2 = properties.getProperty("url");
        String username2 = properties.getProperty("username");
        String password2 = properties.getProperty("password");
        System.out.print(url2+"--"+username2+password2);
    }

    public static Connection getConnection(String path){
        Properties properties = new Properties();
        Connection connection=null;
        try {
            properties.load(DatabaseUtil.class.getResourceAsStream("config.properties"));
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            connection = getConnection(url, username, password);
        } catch (IOException e) {
            e.printStackTrace();
        }
      return connection;
    }
    public static Connection getConnection() {
        return getConnection(url, username, password);
    }

    public static Connection getConnection(String url, String username, String password) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
