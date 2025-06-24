package com.xworkz.smile.repository;

import com.xworkz.smile.dto.AdoptionDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class AdoptionRepositoryImpl implements AdoptionRepository {

    private static final String URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    private static final String INSERT_QUERY = "INSERT INTO adoption_applications "
            + "(child_name, child_age, child_gender, adopter_name, adopter_age, occupation, married, email, phone, address, reason) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    @Override
    public boolean save(AdoptionDTO dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = con.prepareStatement(INSERT_QUERY);

            ps.setString(1, dto.getChildName());
            ps.setInt(2, dto.getChildAge());
            ps.setString(3, dto.getChildGender());
            ps.setString(4, dto.getAdopterName());
            ps.setInt(5, dto.getAdopterAge());
            ps.setString(6, dto.getOccupation());
            ps.setBoolean(7, dto.isMarried());
            ps.setString(8, dto.getEmail());
            ps.setString(9, dto.getPhone());
            ps.setString(10, dto.getAddress());
            ps.setString(11, dto.getReason());

            int rows = ps.executeUpdate();
            con.close();

            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
