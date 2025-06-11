package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class BirthCertificateDTO implements Serializable {
     private long birthId;
     private String hospitalName;
     private String fatherName;
     private String motherName;
     private LocalDate date;
     private String doctorName;
     private String nurseName;
     private  String hospitalType;

    @Override
    public String toString() {
        return "BirthCertificateDTO{" +
                "birthId=" + birthId +
                ", hospitalName='" + hospitalName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", date=" + date +
                ", doctorName='" + doctorName + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", hospitalType='" + hospitalType + '\'' +
                '}';
    }

    public BirthCertificateDTO(long birthId, String hospitalName, String fatherName, String motherName, LocalDate date
             , String doctorName, String nurseName, String hospitalType) {
         this.birthId = birthId;
         this.hospitalName = hospitalName;
         this.fatherName=fatherName;
         this.motherName=motherName;
         this.date = date;
         this.doctorName=doctorName;
         this.nurseName=nurseName;
         this.hospitalType=hospitalType;
     }

    public long getBirthId() {
        return birthId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getNurseName() {
        return nurseName;
    }

    public String getHospitalType() {
        return hospitalType;
    }
}
