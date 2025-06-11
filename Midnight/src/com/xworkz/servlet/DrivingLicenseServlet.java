package com.xworkz.servlet;

import com.xworkz.dto.DrivingLicenseDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/license")
public class DrivingLicenseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DrivingLicenseDTO dto = new DrivingLicenseDTO(
                request.getParameter("name"),
                request.getParameter("address"),
                request.getParameter("mobile"),
                LocalDate.parse(request.getParameter("appliedDate")),
                request.getParameter("vehicleType")
        );

        request.setAttribute("data", dto);
        request.getRequestDispatcher("DrivingLicenseResult.jsp").forward(request, response);
    }
}
