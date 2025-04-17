package com.xworkz.HeavyDriver.Internal;

public class MouseClickListener implements EventListener {

    @Override
    public void onEvent() {
        System.out.println("Mouse clicked!");
    }

    @Override
    public void onError() {
        System.out.println("Mouse click error!");
    }

    @Override
    public void onWarning() {
        System.out.println("Mouse click warning!");
    }
    @Override
    public void onInfo() {
        System.out.println("Mouse click info!");
    }
}
