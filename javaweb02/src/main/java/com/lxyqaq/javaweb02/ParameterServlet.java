package com.lxyqaq.javaweb02;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class ParameterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        System.out.println("--------doPost--------");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");

        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("hobby: " + Arrays.toString(hobby));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("--------doGet--------");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobby = request.getParameterValues("hobby");

        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("hobby: " + Arrays.toString(hobby));
    }

}
