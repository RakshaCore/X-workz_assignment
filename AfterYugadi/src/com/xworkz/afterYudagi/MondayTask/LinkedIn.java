package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.OnlineRecruitmentAgency;
import com.xworkz.afterYudagi.Internal.RecruitmentAgency;

public class LinkedIn {
    public void useLinedIn(RecruitmentAgency recruitmentAgency)
    {
        recruitmentAgency.postJob();
        recruitmentAgency.reviewApplications();
        recruitmentAgency.conductInterview();
        recruitmentAgency.offerJob();
        recruitmentAgency.manageCandidates();

        if(recruitmentAgency instanceof OnlineRecruitmentAgency)
        {
            OnlineRecruitmentAgency onlineRecruitmentAgency=(OnlineRecruitmentAgency) recruitmentAgency;
            onlineRecruitmentAgency.fire();
        }
    }
}
