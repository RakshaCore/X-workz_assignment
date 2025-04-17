package com.xworkz.HeavyDriver.Internal;

public interface TaskRunner {
    void runTask();
    void stopTask();
    void pauseTask();
    default void logTask() {
        System.out.println("Logging task...");
    }


}
