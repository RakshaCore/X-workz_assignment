package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIResumeBuilder;
import com.xworkz.afterYudagi.Internal.ResumeBuilder;

public class AIResume {
    public void resumeBuilt(ResumeBuilder resume)
    {
        resume.collectUserDetails();
        resume.formatResume();
        resume.suggestSkills();
        resume.analyzeJobTrends();
        resume.generatePDF();

        if (resume instanceof AIResumeBuilder)
        {
            AIResumeBuilder aiResumeBuilder=(AIResumeBuilder) resume;
            aiResumeBuilder.ATSScore();
        }

    }
}
