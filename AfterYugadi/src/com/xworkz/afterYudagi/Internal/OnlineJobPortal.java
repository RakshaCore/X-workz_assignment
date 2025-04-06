package com.xworkz.afterYudagi.Internal;

public class OnlineJobPortal extends JobPortal{
    public OnlineJobPortal() {
        System.out.println("OnlineJobPortal Constructor");
    }
    @Override
    public void postJob() {
        System.out.println("JobPortal is posting a job");
    }
@Override
    public void searchJobs() {
        System.out.println("JobPortal is searching for jobs");
    }
@Override
    public void applyForJob() {
        System.out.println("JobPortal is applying for a job");
    }
@Override
    public void scheduleInterview() {
        System.out.println("JobPortal is scheduling an interview");
    }
@Override
    public void offerJob() {
        System.out.println("JobPortal is offering a job");
    }
}
