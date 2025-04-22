package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Ad;

public class Admanager {
    private Ad ad;

    public Admanager(Ad ad) {
        this.ad = ad;
        System.out.println("Running Admanager");
    }

    public void displayAd() {
        if (ad != null) {
            ad.showAd();
        } else {
            System.out.println("NULLLL");
        }
    }
}
