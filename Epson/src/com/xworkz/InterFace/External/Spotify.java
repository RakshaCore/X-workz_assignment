package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.MusicPlayer;

public class Spotify{
    private MusicPlayer musicPlayer;
    public Spotify(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
        System.out.println("Running Spotify");
    }
    public void playMusic() {
        if (this.musicPlayer != null) {
            this.musicPlayer.downloadMusic();
        } else {
            System.err.println("NULLLLL");
        }
    }

}
