package com.Qiwenbin.week3.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LifeCycleServlet", value = "/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {

    public LifeCycleServlet() {
        System.out.println("i am in LifeCycleServlet()");
    }

    @Override
    public void init() {
        System.out.println("i am in init()");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service()->doGet()");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        System.out.println("i am destory()");
    }
}
