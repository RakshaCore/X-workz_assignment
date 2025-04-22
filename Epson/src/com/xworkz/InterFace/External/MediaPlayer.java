package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Media;

public class MediaPlayer {
    private Media media;
    public MediaPlayer(Media media) {
        this.media = media;
        System.out.println("Running MediaPlayer");
    }
    public void play() {
        if (this.media != null) {
            this.media.fastForward();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
