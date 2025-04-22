package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Toy;

public class ToyStore {
    private Toy toy;
    public ToyStore(Toy toy) {
        this.toy = toy;
        System.out.println("Running ToyStore");
    }
    public void play() {
        if (this.toy != null) {
            this.toy.play();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
