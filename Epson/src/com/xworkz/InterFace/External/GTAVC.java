package com.xworkz.InterFace.External;


import com.xworkz.InterFace.Internal.Game;

public class GTAVC {
    private Game game;
    public GTAVC(Game game) {
        this.game = game;
        System.out.println("Running GTAVC");
    }
    public void play() {
        if (this.game != null) {
            this.game.saveProgress();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
