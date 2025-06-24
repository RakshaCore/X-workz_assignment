package com.xworkz.raksha.servlet;

import com.xworkz.raksha.dto.RakshaDTO;
import com.xworkz.raksha.service.RakshaService;
import com.xworkz.raksha.service.RakshaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns ="/register",loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName=req.getParameter("firstName");
        String lastName=req.getParameter("lastName");
        String email=req.getParameter("email");
        RakshaDTO rakshaDTO=new RakshaDTO(firstName,lastName, email);
        System.out.println(rakshaDTO.getFirstName());

        RakshaService rakshaService=new RakshaServiceImpl();
        rakshaService.validateAndSave(rakshaDTO);





    }
}
