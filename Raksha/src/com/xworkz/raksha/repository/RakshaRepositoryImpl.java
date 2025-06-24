package com.xworkz.raksha.repository;

import com.xworkz.raksha.dto.RakshaDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RakshaRepositoryImpl implements RakshaRepository{
    @Override
    public void save(RakshaDTO rakshaDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/adoption";
            String username="root";
            String password="Xworkzodc@123";
            Connection connection= DriverManager.getConnection(url,username,password);

            String sql="insert into raksha values(0,'"+rakshaDTO.getFirstName()+"','"+rakshaDTO.getLastName()+"','"+rakshaDTO.getEmail()+"')";
            Statement statement=connection.createStatement();

            statement.executeUpdate(sql);
            System.out.println("Connection"+connection);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
