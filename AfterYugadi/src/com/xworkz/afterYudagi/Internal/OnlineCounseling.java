package com.xworkz.afterYudagi.Internal;

public class OnlineCounseling extends Counseling{
    public OnlineCounseling() {
        System.out.println("Online Mental Health Counseling System Activated");
    }
@Override
    public void scheduleSession() {
        System.out.println("Scheduling a counseling session");
    }
@Override
    public void provideTherapy() {
        System.out.println("Providing therapy to the client");
    }
@Override
    public void assessMentalHealth() {
        System.out.println("Assessing client's mental health condition");
    }
@Override
    public void suggestExercises() {
        System.out.println("Suggesting mental wellness exercises");
    }
@Override
    public void recordSessionNotes() {
        System.out.println("Recording notes for the counseling session");
    }
}
