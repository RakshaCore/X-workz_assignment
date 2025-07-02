package com.xworkz.phonebook.servlet;

import com.xworkz.phonebook.dto.PhoneBookDTO;
import com.xworkz.phonebook.service.PhoneBookService;
import com.xworkz.phonebook.service.PhoneBookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addContact", loadOnStartup = 1)
public class AddContactServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullName = req.getParameter("fullName");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");

        PhoneBookDTO phoneBookDTO = new PhoneBookDTO( fullName, phoneNumber, email);

        PhoneBookService phoneBookService = new PhoneBookServiceImpl();
        phoneBookService.validateAndSave(phoneBookDTO);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        int convertedId = Integer.parseInt(id);
        PhoneBookService phoneBookService = new PhoneBookServiceImpl();
        phoneBookService.getById(convertedId);

    }
}
