package com.xworkz.servlet;

import com.xworkz.dto.MarriageCertificateDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/marriage")
public class MarriageCertificateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MarriageCertificateDTO dto = new MarriageCertificateDTO(
                request.getParameter("groomName"),
                request.getParameter("brideName"),
                request.getParameter("location"),
                request.getParameter("address"),
                request.getParameter("religion"),
                LocalDate.parse(request.getParameter("date")),
                request.getParameter("witness1"),
                request.getParameter("witness2"),
                request.getParameter("officerPresent")
        );

        request.setAttribute("data", dto);
        request.getRequestDispatcher("MarriageResult.jsp").forward(request, response);
    }
}
