package com.zrx.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zhang on 2015/9/4.
 */
@javax.servlet.annotation.WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String path = this.getServletContext().getRealPath("/index.jsp");
        out.print(path+"<br/>");
//        Set<String> resourcePaths = getServletContext().getResourcePaths("/web");//无输出
        Set<String> resourcePaths = getServletContext().getResourcePaths("/WEB-INF");
        Iterator<String> iterator = resourcePaths.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            out.print(name+"<BR/>");
        }
        ServletContext app = getServletContext();
        String contextPath = app.getContextPath();
        out.print(contextPath+"<br/>");
        String initParameter = app.getInitParameter("param-name");
        out.print(initParameter+"<br/>");
        String serverInfo = app.getServerInfo();
        out.print(serverInfo+"<br/>");
        String virtualServerName = app.getVirtualServerName();
        out.print(virtualServerName+"<br/>");
        String servletContextName = app.getServletContextName();
        out.print(servletContextName+"<br/>");//null
        String img = app.getMimeType("img");
        out.print(img+"<br/>");
        String mp3 = app.getMimeType("mp3");
        out.print(mp3);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
