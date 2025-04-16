package com.xworkz.HeavyDriver.Internal;

public class JobExecutor implements TaskRunner
{
    @Override
    public void runTask() {
        System.out.println("Running task...");
    }

    @Override
    public void stopTask() {
        System.out.println("Stopping task...");
    }

    @Override
    public void pauseTask() {
        System.out.println("Pausing task...");
    }


}
