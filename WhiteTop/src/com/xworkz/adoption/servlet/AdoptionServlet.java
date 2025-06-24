package com.xworkz.adoption.servlet;

import com.xworkz.adoption.dto.AdoptionDTO;
import com.xworkz.adoption.service.AdoptionService;
import com.xworkz.adoption.service.AdoptionServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/adoption",loadOnStartup = 1)
public class AdoptionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName= req.getParameter("firstName");
        String lastName=req.getParameter("lastName");
        String age=req.getParameter("age");
        String city=req.getParameter("city");
        String state=req.getParameter("state");
        String zip=req.getParameter("zip");
        String maritalStatus=req.getParameter("radioDefault");
        String adoptionType = req.getParameter("adoptionType");

        int adaptorAge= Integer.parseInt(req.getParameter("age"));

        AdoptionDTO adoptionDTO= new AdoptionDTO(firstName, lastName, adaptorAge, city, state, zip, maritalStatus, adoptionType);

        AdoptionService adoptionService = new AdoptionServiceImpl();
        String result= adoptionService.validateAndSave(adoptionDTO);
        System.out.println("Message "+result);

        if(!result.equals("Form submitted"))
        {
            req.setAttribute("dto",adoptionDTO);
        }

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("adoption.jsp");
        req.setAttribute("message",result);
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        int convertedId= Integer.parseInt(id);

        AdoptionService adoptionService=new AdoptionServiceImpl();
        adoptionService.getById(convertedId);

        


    }
}
