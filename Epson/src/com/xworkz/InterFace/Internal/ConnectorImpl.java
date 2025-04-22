package com.xworkz.InterFace.Internal;

public class ConnectorImpl implements Connector{

    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
