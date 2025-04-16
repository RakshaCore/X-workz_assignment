package com.xworkz.HeavyDriver.Internal;

public class WhatsApp implements MobileApp {

    @Override
    public void install() {
        System.out.println("WhatsApp is installed.");
    }

    @Override
    public void uninstall() {
        System.out.println("WhatsApp is uninstalled.");
    }

    @Override
    public void update() {
        System.out.println("WhatsApp is updated.");
    }
}
