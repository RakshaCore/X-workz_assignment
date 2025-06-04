package com.xworkz.bankservlet.internal;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/actor",loadOnStartup = 1)
public class JavaServlet extends GenericServlet {

    public JavaServlet() {
        System.out.println("Tomcat is created the object ");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running JavaServlet in ");

        String name = servletRequest.getParameter("name");
        String lang = servletRequest.getParameter("lang");
        String bb = servletRequest.getParameter("bb");
        String flp = servletRequest.getParameter("flp");
        String um = servletRequest.getParameter("um");
        String umd = servletRequest.getParameter("umd");
        String umb = servletRequest.getParameter("umb");


        int flpCount = Integer.parseInt(flp);
        int bbCount = Integer.parseInt(bb);


        System.out.println("Name: " + name +"language: "+lang +"blockbuster: "+bbCount+"flop: "+flpCount);

        PrintWriter writer = servletResponse.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<h1>");
        writer.println(name+"registered succesfully");
        writer.println("</h1>");
        writer.println("<body>");
        writer.println("</body>");
        writer.println("</head>");
        writer.println("<html>");
        writer.println("<html>");
    }



}