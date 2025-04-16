package com.xworkz.HeavyDriver.Internal;

public class AmoungUs implements MobileGame {
    @Override
    public void customizeCharacter() {
        System.out.println("Customizing character in Among Us");
    }

    @Override
    public void joinMultiplayer() {
        System.out.println("Joining multiplayer game in Among Us");
    }

    @Override
    public void sendInGameMessage() {
        System.out.println("Sending in-game message in Among Us");
    }
}
