package com.xworkz.servlet;

import com.xworkz.dto.JobApplicationDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/jobApply")
public class JobApplicationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String education = request.getParameter("education");
        String skills = request.getParameter("skills");
        String expectedSalary = request.getParameter("expectedSalary");
        String experience = request.getParameter("experience");

        JobApplicationDTO dto = new JobApplicationDTO(name, email, education, skills, expectedSalary, experience);
        request.setAttribute("data", dto);
        request.getRequestDispatcher("JobApplicationResult.jsp").forward(request, response);
    }
}
