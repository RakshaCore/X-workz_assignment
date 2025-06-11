package com.xworkz.servlet;

import com.xworkz.dto.DeathCertificateDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

@WebServlet("/death")
public class DeathCertificateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DeathCertificateDTO dto = new DeathCertificateDTO(
                request.getParameter("name"),
                request.getParameter("cause"),
                LocalDate.parse(request.getParameter("date")),
                LocalTime.parse(request.getParameter("time")),
                Integer.parseInt(request.getParameter("ageAtDeath")),
                request.getParameter("certifiedBy"),
                request.getParameter("hospitalName"),
                request.getParameter("mannerOfDeath"),
                request.getParameter("gender"),
                request.getParameter("marks")
        );

        request.setAttribute("data", dto);
        request.getRequestDispatcher("DeathResult.jsp").forward(request, response);
    }
}
