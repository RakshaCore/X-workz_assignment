package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.FitnessTracker;
import com.xworkz.afterYudagi.Internal.OnlineFitnessTracker;

public class BoatCrest {
    public void health(FitnessTracker fitnessTracker)
    {
        fitnessTracker.trackSteps();
        fitnessTracker.measureHeartRate();
        fitnessTracker.calculateCaloriesBurned();
        fitnessTracker.monitorSleep();
        fitnessTracker.generateWorkoutPlan();
        if (fitnessTracker instanceof OnlineFitnessTracker)
        {
            OnlineFitnessTracker onlineFitnessTracker=(OnlineFitnessTracker) fitnessTracker;
            onlineFitnessTracker.generateReport();
        }
    }
}
