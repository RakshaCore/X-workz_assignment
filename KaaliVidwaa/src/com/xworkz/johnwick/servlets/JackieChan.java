package com.xworkz.johnwick.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/JackieChan",loadOnStartup = 1)
public class JackieChan extends GenericServlet {
 public JackieChan()
 {
     System.out.println("Jackie Channnnnnnnnnnnnnnn");
 }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running service in JackieChan");
    }
}
