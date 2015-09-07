package com.zrx.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhang on 2015/9/5.
 */
@WebServlet(name = "CountServlet")
public class CountServlet extends HttpServlet {
    Integer count;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext app = getServletContext();
        int sum = 0;
//        response.getWriter().print(sum);
        count = (Integer) app.getAttribute("count");
//        response.getWriter().print(count);
        if (count == null) {
            count=1;
            app.setAttribute("count", count);
        } else {
            response.getWriter().print(count+++"<br/>");
            app.setAttribute("count", count);//count++  错误
        }
        response.getWriter().print(count + "-------");
    }
}
