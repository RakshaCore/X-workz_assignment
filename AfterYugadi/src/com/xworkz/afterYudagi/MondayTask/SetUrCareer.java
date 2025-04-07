package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AICareerCounseling;
import com.xworkz.afterYudagi.Internal.CareerCounseling;

public class SetUrCareer {
    public void career(CareerCounseling counseling101)
    {
        counseling101.assessSkills();
        counseling101.suggestCareerPaths();
        counseling101.provideTrainingResources();
        counseling101.conductMockInterviews();
        counseling101.trackCareerProgress();

        if (counseling101 instanceof AICareerCounseling)
        {
            AICareerCounseling aiCareerCounseling=(AICareerCounseling) counseling101;
            aiCareerCounseling.Career();
        }
    }
}
