package com.xworkz.servlet;

import com.xworkz.dto.BirthCertificateDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/birthCertificate", loadOnStartup = 1)
public class BirthCertificateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest servletRequest,HttpServletResponse servletResponse) throws ServletException, IOException
    {
        String birthId=servletRequest.getParameter("BirthId");
        String hospitalName=servletRequest.getParameter("hospitalName");
        String fatherName=servletRequest.getParameter("fatherName");
        String motherName=servletRequest.getParameter("motherName");
        String birthDateTime=servletRequest.getParameter("birthDateTime");
        String doctorName=servletRequest.getParameter("doctorName");
        String nurseName=servletRequest.getParameter("nurseName");
        String hospitalType=servletRequest.getParameter("hospitalType");

        long birthIdLong = Long.parseLong(birthId);
        LocalDate newbirthDateTime=LocalDate.parse(birthDateTime);

        BirthCertificateDTO birthCertificateDTO=new BirthCertificateDTO(birthIdLong,
                hospitalName, fatherName, motherName, newbirthDateTime,doctorName, nurseName, hospitalType);
        servletRequest.setAttribute("birth", birthCertificateDTO);

        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("BirthResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
    }
}
