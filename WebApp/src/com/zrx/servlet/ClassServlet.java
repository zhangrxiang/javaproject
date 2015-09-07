package com.zrx.servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zhang on 2015/9/6.
 */
@WebServlet(name = "ClassServlet")
public class ClassServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("/a.txt");//a.txt ->ok
        String s = "";
        s = IOUtils.toString(resourceAsStream);
        // response.getWriter().print(s);
//        InputStream resourceAsStream1 = getClass().getResourceAsStream("b.txt");
//        String string =new String(IOUtils.toString(resourceAsStream1).getBytes("ISO8859-1"),"utf-8");
//        System.out.print(string);
//        response.setContentType("text/application");
//        request.setCharacterEncoding("utf-8");
//        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String string = IOUtils.toString(getClass().getResourceAsStream("/../../index.jsp"));
        String s2 = new String(string.getBytes("gbk"),"utf-8");
        System.out.print(s2);
        response.getWriter().print(s2 + "怎么会乱码啊");
    }
}
