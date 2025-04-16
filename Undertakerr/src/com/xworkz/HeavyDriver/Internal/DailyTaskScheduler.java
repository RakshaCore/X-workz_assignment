package com.xworkz.HeavyDriver.Internal;

public class DailyTaskScheduler implements Scheduler {

    @Override
    public void schedule() {
        System.out.println("Scheduling daily tasks...");
    }

    @Override
    public void reschedule() {
        System.out.println("Rescheduling daily tasks...");
    }

    @Override
    public void cancel() {
        System.out.println("Cancelling daily tasks...");
    }
}
