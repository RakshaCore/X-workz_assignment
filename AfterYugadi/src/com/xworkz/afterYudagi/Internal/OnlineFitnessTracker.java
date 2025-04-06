package com.xworkz.afterYudagi.Internal;

public class OnlineFitnessTracker extends FitnessTracker{

        public OnlineFitnessTracker() {
            System.out.println("OnlineFitnessTracker Constructor");
        }
@Override
    public void trackSteps() {
        System.out.println("FitnessTracker is tracking steps");
    }
@Override
    public void measureHeartRate() {
        System.out.println("FitnessTracker is measuring heart rate");
    }
@Override
    public void calculateCaloriesBurned() {
        System.out.println("FitnessTracker is calculating calories burned");
    }
@Override
    public void monitorSleep() {
        System.out.println("FitnessTracker is monitoring sleep patterns");
    }
@Override
    public void generateWorkoutPlan() {
        System.out.println("FitnessTracker is generating a workout plan");
    }

}
