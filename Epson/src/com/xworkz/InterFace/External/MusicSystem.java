package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Speaker;

public class MusicSystem {
    private Speaker speaker;

    public MusicSystem(Speaker speaker) {
        this.speaker = speaker;
        System.out.println("Running MusicSystem");
    }

    public void playMusic() {
        if (this.speaker != null) {
            this.speaker.play();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
