package com.xworkz.dto;

import java.io.Serializable;

public class JobApplicationDTO implements Serializable {
    private String name;
    private String email;
    private String education;
    private String skills;
    private String expectedSalary;
    private String experience;

    public JobApplicationDTO(String name, String email, String education, String skills, String expectedSalary, String experience) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.skills = skills;
        this.expectedSalary = expectedSalary;
        this.experience = experience;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getEducation() { return education; }
    public String getSkills() { return skills; }
    public String getExpectedSalary() { return expectedSalary; }
    public String getExperience() { return experience; }


    @Override
    public String toString() {
        return "JobApplicationDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", skills='" + skills + '\'' +
                ", expectedSalary='" + expectedSalary + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}