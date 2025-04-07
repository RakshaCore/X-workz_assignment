package com.xworkz.afterYudagi.Internal;

public class OnlineJobPortal extends JobPortal{
    public OnlineJobPortal() {
        System.out.println("OnlineJobPortal Constructor");
    }
    @Override
    public void postJob() {
        System.out.println("Online-JobPortal is posting a job");
    }
@Override
    public void searchJobs() {
        System.out.println("Online-JobPortal is searching for jobs");
    }
@Override
    public void applyForJob() {
        System.out.println("Online-JobPortal is applying for a job");
    }
@Override
    public void scheduleInterview() {
        System.out.println("Online-JobPortal is scheduling an interview");
    }
@Override
    public void offerJob() {
        System.out.println("Online-JobPortal is offering a job");
    }
    public void signIn()
    {
        System.out.println("SignIN");
    }
}
