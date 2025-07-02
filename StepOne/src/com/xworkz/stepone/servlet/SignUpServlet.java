package com.xworkz.stepone.servlet;

import com.xworkz.stepone.dto.UserDTO;
import com.xworkz.stepone.service.SignUpService;
import com.xworkz.stepone.service.SignUpServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signUp", loadOnStartup = 1)
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        String userName=req.getParameter("userName");
        String password=req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        UserDTO userDTO = new UserDTO(email, userName, password, confirmPassword);

        SignUpService signUpService = new SignUpServiceImpl();
        signUpService.validateAndSave(userDTO);



    }
}
