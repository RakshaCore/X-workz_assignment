package com.xworkz.afterYudagi.Internal;

public class OnlineUniversity extends University{
    public OnlineUniversity() {
        System.out.println("OnlineUniversity Constructor");
    }
    @Override
    public void enrollStudents() {
        System.out.println("Online-University is enrolling students");
    }
    @Override
    public void conductLectures() {
        System.out.println("Online-University is conducting lectures");
    }
    @Override
    public void conductExams() {
        System.out.println("Online-University is conducting exams");
    }
    @Override
    public void issueDegrees() {
        System.out.println("Online-University is issuing degrees");
    }
    @Override
    public void manageLibrary() {
        System.out.println("Online-University is managing its library");
    }
}
