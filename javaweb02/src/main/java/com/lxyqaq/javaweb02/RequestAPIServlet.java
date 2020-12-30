package com.lxyqaq.javaweb02;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName RequestAPIServlet
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/12/29 16:36
 * @Version 1.0
 */
public class RequestAPIServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //i.getRequestURI() 获取请求的资源路径
        System.out.println("URI => " + req.getRequestURI());
        System.out.println("URL => " + req.getRequestURL());
        System.out.println("客户端ip地址 => " + req.getRemoteHost());
        System.out.println("请求头User-Agent => " + req.getHeader("User-Agent"));
        System.out.println("请求方式 => " + req.getMethod());
    }
}
