package com.xworkz.WaterBottle;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/contact",loadOnStartup = 1)
public class ContactServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("ContactServlet is called and Running");

        String name = servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String phone=servletRequest.getParameter("phone");
        String comments=servletRequest.getParameter("comments");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("ContactResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
    }

}
