package com.revature.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 *  Servlet Hierarchy
 *
 *  Servlet - Interface
 *  GenericServlet - Abstract Class
 *  HttpServlet - Abstract Class
 *  HelloServlet - Concrete Class (implementation)
 */

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // doGet is going to send "Welcome to Servlets!!!"
        resp.setHeader("Content-Type", "text/html");
        resp.setStatus(HttpServletResponse.SC_OK);
        resp.getOutputStream().println(
                "<h3>Hello World</h3>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // receive request
        // parse request
        // call dao
        // success 200
        // failures

       Map<String, String[]> parameters = req.getParameterMap();
       for(String key: parameters.keySet()){
           System.out.println("key" + key);
           System.out.println("value" + req.getParameter(key));
       }

       List<String> list = req.getReader().lines().collect(Collectors.toList());


       StringBuilder builder = new StringBuilder();
       list.forEach(builder::append);
       System.out.println(builder.toString());
    }


}
