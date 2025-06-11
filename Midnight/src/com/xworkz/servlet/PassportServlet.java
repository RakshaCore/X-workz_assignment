package com.xworkz.servlet;

import com.xworkz.dto.PassportDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/passport")
public class PassportServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PassportDTO dto = new PassportDTO(
                request.getParameter("applicantName"),
                request.getParameter("aadharNo"),
                request.getParameter("address"),
                request.getParameter("panNo"),
                request.getParameter("country"),
                request.getParameter("state"),
                request.getParameter("city"),
                request.getParameter("pinCode"),
                request.getParameter("passportType"),
                request.getParameter("paymentRefNo")
        );

        request.setAttribute("data", dto);
        request.getRequestDispatcher("PassportResult.jsp").forward(request, response);
    }
}
