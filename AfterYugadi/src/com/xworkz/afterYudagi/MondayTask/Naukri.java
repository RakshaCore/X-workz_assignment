package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.JobPortal;
import com.xworkz.afterYudagi.Internal.OnlineJobPortal;

public class Naukri {
    public void signIn(JobPortal jobPortal)
    {
        jobPortal.postJob();
        jobPortal.searchJobs();
        jobPortal.applyForJob();
        jobPortal.scheduleInterview();
        jobPortal.offerJob();
        if (jobPortal instanceof OnlineJobPortal)
        {
            OnlineJobPortal onlineJobPortal=(OnlineJobPortal) jobPortal;
            onlineJobPortal.signIn();
        }
    }
}
