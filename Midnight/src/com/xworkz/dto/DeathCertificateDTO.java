package com.xworkz.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class DeathCertificateDTO implements Serializable {
    private String name;
    private String cause;
    private LocalDate date;
    private LocalTime time;
    private int ageAtDeath;
    private String certifiedBy;
    private String hospitalName;
    private String mannerOfDeath;
    private String gender;
    private String marks;

    public DeathCertificateDTO(String name, String cause, LocalDate date, LocalTime time, int ageAtDeath,
                               String certifiedBy, String hospitalName, String mannerOfDeath, String gender, String marks) {
        this.name = name;
        this.cause = cause;
        this.date = date;
        this.time = time;
        this.ageAtDeath = ageAtDeath;
        this.certifiedBy = certifiedBy;
        this.hospitalName = hospitalName;
        this.mannerOfDeath = mannerOfDeath;
        this.gender = gender;
        this.marks = marks;
    }

    public String getName() { return name; }
    public String getCause() { return cause; }
    public LocalDate getDate() { return date; }
    public LocalTime getTime() { return time; }
    public int getAgeAtDeath() { return ageAtDeath; }
    public String getCertifiedBy() { return certifiedBy; }
    public String getHospitalName() { return hospitalName; }
    public String getMannerOfDeath() { return mannerOfDeath; }
    public String getGender() { return gender; }
    public String getMarks() { return marks; }
}
