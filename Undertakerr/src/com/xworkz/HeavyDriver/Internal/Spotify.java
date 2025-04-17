package com.xworkz.HeavyDriver.Internal;

public class Spotify implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("Playing music on Spotify");
    }

    @Override
    public void shufflePlaylist() {
        System.out.println("Shuffling playlist on Spotify");
    }

    @Override
    public void repeatTrack() {
        System.out.println("Repeating track on Spotify");
    }
    @Override
    public void stopMusic() {
        System.out.println("Stopping music on Spotify");
    }
}
