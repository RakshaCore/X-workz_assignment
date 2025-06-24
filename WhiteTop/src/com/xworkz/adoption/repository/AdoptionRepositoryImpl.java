package com.xworkz.adoption.repository;

import com.xworkz.adoption.dto.AdoptionDTO;

import java.sql.*;

public class AdoptionRepositoryImpl implements AdoptionRepository {

    @Override
    public String save(AdoptionDTO adoptionDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/adoption";
            String name="root";
            String password="Xworkzodc@123";
            Connection connection= DriverManager.getConnection(url,name,password);

//            String sql="INSERT INTO adoption values(0,'"+adoptionDTO.getFirstName()+"','"+adoptionDTO.getLastName()+"','"+adoptionDTO.getAge()+"','"+adoptionDTO.getCity()+"','"+adoptionDTO.getState()+"',"+adoptionDTO.getZip()+",'"+adoptionDTO.getMaritalStatus()+"','"+adoptionDTO.getAdoptionType()+"')";
//            Statement statement=connection.createStatement();
//            statement.executeUpdate(sql);

            String noCatsql="INSERT INTO adoption values(?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement=connection.prepareStatement(noCatsql);
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,adoptionDTO.getFirstName());
            preparedStatement.setString(3,adoptionDTO.getLastName());
            preparedStatement.setInt(4,adoptionDTO.getAge());
            preparedStatement.setString(5,adoptionDTO.getCity());
            preparedStatement.setString(6,adoptionDTO.getState());
            preparedStatement.setString(7,adoptionDTO.getZip());
            preparedStatement.setString(8,adoptionDTO.getMaritalStatus());
            preparedStatement.setString(9,adoptionDTO.getAdoptionType());

            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return "false";
    }

    @Override
    public AdoptionDTO getDetails(int id) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3307/adoption";
            String name="root";
            String password="Xworkzodc@123";
            Connection connection= DriverManager.getConnection(url,name,password);

            String sql="SELECT * FROM adoption where id=("+id+")";
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);

            while (resultSet.next()) {
            int pk=resultSet.getInt("ADID");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


        return null;
    }

}
