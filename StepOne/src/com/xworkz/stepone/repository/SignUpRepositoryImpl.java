package com.xworkz.stepone.repository;

import com.xworkz.stepone.dto.UserDTO;

import java.sql.*;

public class SignUpRepositoryImpl implements SignUpRepository {

    @Override
    public void save(UserDTO userDTO) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stepone";
            String username = "root";
            String password = "Xworkzodc@123";
            Connection connection= DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO signup(id,email, userName, password, confirmPassword) VALUES (?,?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, userDTO.getEmail());
            preparedStatement.setString(3, userDTO.getUserName());
            preparedStatement.setString(4, userDTO.getPassword());

            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            preparedStatement.setTimestamp(5, timestamp);

            preparedStatement.executeUpdate();


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
