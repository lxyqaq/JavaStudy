package com.lxyqaq.javaweb02;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取请求的参数
        String username = request.getParameter("username");
        System.out.println("在Servlet1中查看参数: " + username);

        //给参数盖一个章,并传递到Servlet2中去查看
        request.setAttribute("key1", "柜台一的章");

        //怎么去到Servlet2？
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet2");

        //去到Servlet2
        requestDispatcher.forward(request, response);

    }
}
