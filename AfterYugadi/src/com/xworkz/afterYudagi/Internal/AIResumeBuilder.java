package com.xworkz.afterYudagi.Internal;

public class AIResumeBuilder extends ResumeBuilder{
    public AIResumeBuilder() {
        System.out.println("AI-Based Resume Builder Activated");
    }
@Override
    public void collectUserDetails() {
        System.out.println("Collecting user  details for resume");
    }
@Override
    public void formatResume() {
        System.out.println("Formatting resume  based on selected template");
    }
@Override
    public void suggestSkills() {
        System.out.println("Suggesting relevant  skills for the job application");
    }
@Override
    public void analyzeJobTrends() {
        System.out.println("Analyzing job  market trends for resume optimization");
    }
@Override
    public void generatePDF() {
        System.out.println("Generating  resume in PDF format");
    }

    public  void ATSScore()
    {
        System.out.println("Score is .......");
    }
}
