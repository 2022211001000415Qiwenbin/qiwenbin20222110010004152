package com.Qiwenbin.week2.homework;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        // 获取当前时间并格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = sdf.format(new Date());

        writer.println("Name : Qiwenbin");
        writer.println("ID : 2022211001000415");
        writer.println("Current Time : " + currentDateTime);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        // 在这里处理 POST 请求（此处为空）
    }
}