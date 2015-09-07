package com.zrx.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhang on 2015/9/6.
 */

//@WebServlet(name = "StateCodeServlet")
@WebServlet(urlPatterns = {"/stateCode", "/s1", "/s2"}, name = "StateCodeServlet")
public class StateCodeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        response.setStatus(404,"资源已经找到就是不给你看。。。");
//    response.setStatus(500);
//        response.sendError(404, "资源已经找到就是不给你看。。。");
//    response.sendRedirect("LoginServlet");
        String remoteAddr = request.getRemoteAddr();
        String method = request.getMethod();
        String header = request.getHeader("User-Agent");
        response.getWriter().print(remoteAddr+"--"+method+"--"+header);
    }
}
