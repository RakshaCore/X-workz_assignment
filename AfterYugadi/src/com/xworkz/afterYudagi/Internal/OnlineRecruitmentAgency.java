package com.xworkz.afterYudagi.Internal;

public class OnlineRecruitmentAgency extends RecruitmentAgency{
    public OnlineRecruitmentAgency() {
        System.out.println("OnlineRecruitmentAgency Constructor");
    }
 @Override
 public void postJob() {
        System.out.println("Recruitment agency is posting a job");
    }
@Override

    public void reviewApplications() {
        System.out.println("Recruitment agency is reviewing applications");
    }
@Override

    public void conductInterview() {
        System.out.println("Recruitment agency is conducting interviews");
    }
@Override

    public void offerJob() {
        System.out.println("Recruitment agency is offering a job");
    }
@Override

    public void manageCandidates() {
        System.out.println("Recruitment agency is managing candidates");
    }
}
