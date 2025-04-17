package com.xworkz.HeavyDriver.Internal;

public interface MusicPlayer {
    void playMusic();
    void shufflePlaylist();

    void repeatTrack();
    default void stopMusic() {
        System.out.println("Stopping music");
    }

}
