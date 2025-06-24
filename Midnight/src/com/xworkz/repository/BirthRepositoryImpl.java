package com.xworkz.repository;

import com.xworkz.dto.BirthCertificateDTO;

import java.sql.Connection;
import java.sql.DriverManager;

public class BirthRepositoryImpl implements BirthRepository {

    @Override
    public String save(BirthCertificateDTO birthCertificateDTO) throws  {
        Class.forName("com.mysql.cj.jdbc.Driver");//FQN
        String url="jdbc:mysql://localhost:3306/ko19rom";
        String username="root";
        String password="Xworkzodc@123";
        Connection connection= DriverManager.getConnection(url,username,password);
        return "false";
    }
}i
