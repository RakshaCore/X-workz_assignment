package com.xworkz.phonebook.repository;

import com.xworkz.phonebook.dto.PhoneBookDTO;

import java.sql.*;

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
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/phonebook";
            String name = "root";
            String password = "Xworkzodc@123";
            Connection connection = DriverManager.getConnection(url, name, password);

            String sql = "SELECT * FROM phonebook WHERE id = " + id + "";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int pk = resultSet.getInt("ID");
                String fullName = resultSet.getString("FullName");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String email = resultSet.getString("Email");
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

}
