package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.Counseling;
import com.xworkz.afterYudagi.Internal.OnlineCounseling;

public class OCitseems {
    public void goSeekHelp(Counseling counseling)
    {
        counseling.scheduleSession();
        counseling.provideTherapy();
        counseling.assessMentalHealth();
        counseling.suggestExercises();
        counseling.recordSessionNotes();

        if(counseling instanceof OnlineCounseling)
        {
            OnlineCounseling onlineCounseling=(OnlineCounseling) counseling;
            onlineCounseling.finalSolution();
        }
    }
}
