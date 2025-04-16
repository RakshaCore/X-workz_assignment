package com.xworkz.HeavyDriver.Internal;

public interface Observer {
    void update();
    void notifyObservers();
    void registerObserver();
}
