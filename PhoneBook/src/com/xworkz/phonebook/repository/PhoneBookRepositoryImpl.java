package com.xworkz.phonebook.repository;

import com.xworkz.phonebook.dto.PhoneBookDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PhoneBookRepositoryImpl implements PhoneBookRepository {

    @Override
    public String save(PhoneBookDTO phoneBookDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/phonebook";
            String name = "root";
            String password = "Xworkzodc@123";
            Connection connection = DriverManager.getConnection(url, name, password);

            String sql="INSERT INTO phonebook values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, phoneBookDTO.getFullName());
            preparedStatement.setString(3, phoneBookDTO.getPhoneNumber());
            preparedStatement.setString(4, phoneBookDTO.getEmail());

            preparedStatement.executeUpdate();
        }

        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    return "false";
    }

    @Override
    public PhoneBookDTO getDetails(int id) {
        return null;
    }

}
