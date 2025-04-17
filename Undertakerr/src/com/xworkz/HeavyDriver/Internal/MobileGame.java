package com.xworkz.HeavyDriver.Internal;

public interface MobileGame {
    void customizeCharacter();
    void joinMultiplayer();
    void sendInGameMessage();
    default void playGame() {
        System.out.println("Playing the mobile game");
    }
}
