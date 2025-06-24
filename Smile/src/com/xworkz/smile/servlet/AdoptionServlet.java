package com.xworkz.smile.servlet;

import com.xworkz.smile.dto.AdoptionDTO;
import com.xworkz.smile.service.AdoptionService;
import com.xworkz.smile.service.AdoptionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet()
public class AdoptionServlet extends HttpServlet

{

private AdoptionService service = new AdoptionServiceImpl();

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    AdoptionDTO dto = new AdoptionDTO(
            req.getParameter("childName"),
            Integer.parseInt(req.getParameter("childAge")),
            req.getParameter("childGender"),
            req.getParameter("adopterName"),
            Integer.parseInt(req.getParameter("adopterAge")),
            req.getParameter("occupation"),
            Boolean.parseBoolean(req.getParameter("married")),
            req.getParameter("email"),
            req.getParameter("phone"),
            req.getParameter("address"),
            req.getParameter("reason")
    );


    boolean result = service.validateAndSave(dto);
    if (result) {
        req.setAttribute("message", "Adoption form submitted successfully!");
        req.getRequestDispatcher("success.jsp").forward(req, resp);
    } else {
        req.setAttribute("error", "Validation failed. Please check your inputs.");
        req.getRequestDispatcher("AdoptionForm.jsp").forward(req, resp);
    }
}}
