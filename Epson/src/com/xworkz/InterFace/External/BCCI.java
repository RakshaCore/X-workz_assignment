package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.ICC;

public class BCCI {
    private ICC icc;
    public BCCI(ICC icc) {
        System.out.println("Running ICC in BCCI");
        this.icc = icc;
    }
    public void play() {
        if (this.icc != null) {
            this.icc.fairPlay();
        } else
            System.err.println("NULLLLL");
    }

}
