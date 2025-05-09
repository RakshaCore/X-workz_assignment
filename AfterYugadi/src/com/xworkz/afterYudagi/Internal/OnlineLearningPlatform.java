package com.xworkz.afterYudagi.Internal;

public class OnlineLearningPlatform extends  LearningPlatform{
    public OnlineLearningPlatform() {
        System.out.println("OnlineLearningPlatform Constructor");
    }
@Override
    public void enrollCourse() {
        System.out.println("Online LearningPlatform is enrolling a student in a course");
    }
@Override
    public void watchLecture() {
        System.out.println("Online LearningPlatform is streaming a lecture");
    }
@Override
    public void takeQuiz() {
        System.out.println("Online LearningPlatform is providing a quiz");
    }
@Override
    public void submitAssignment() {
        System.out.println("Online LearningPlatform is accepting an assignment submission");
    }
@Override
    public void issueCertificate() {
        System.out.println("Online LearningPlatform is issuing a certificate");
    }
public void giveFeedback()
{
    System.out.println("Feedback");
}
}
