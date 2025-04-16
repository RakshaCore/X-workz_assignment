package com.xworkz.HeavyDriver.Internal;

public interface Scheduler {
    void schedule();
    void reschedule();
    void cancel();
}
