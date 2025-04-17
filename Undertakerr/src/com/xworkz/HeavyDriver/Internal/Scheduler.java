package com.xworkz.HeavyDriver.Internal;

public interface Scheduler {
    void schedule();
    void reschedule();
    void cancel();
    default void logSchedule() {
        System.out.println("Logging schedule...");
    }
}
