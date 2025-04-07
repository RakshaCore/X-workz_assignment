package com.xworkz.afterYudagi.Internal;

public class OnlineFitnessTracker extends FitnessTracker{

        public OnlineFitnessTracker() {
            System.out.println("OnlineFitnessTracker Constructor");
        }
@Override
    public void trackSteps() {
        System.out.println("Online FitnessTracker is tracking steps");
    }
@Override
    public void measureHeartRate() {
        System.out.println("Online FitnessTracker is measuring heart rate");
    }
@Override
    public void calculateCaloriesBurned() {
        System.out.println("Online FitnessTracker is calculating calories burned");
    }
@Override
    public void monitorSleep() {
        System.out.println("Online FitnessTracker is monitoring sleep patterns");
    }
@Override
    public void generateWorkoutPlan() {
        System.out.println("Online FitnessTracker is generating a workout plan");
    }
    public void generateReport()
    {
        System.out.println("Here is ur plan");
    }

}
