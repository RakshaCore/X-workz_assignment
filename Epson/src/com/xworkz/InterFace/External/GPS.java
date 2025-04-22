package com.xworkz.InterFace.External;
import com.xworkz.InterFace.Internal.Navigation;

public class GPS {
    private Navigation navigation;
    public GPS(Navigation navigation) {
        this.navigation = navigation;
        System.out.println("Running GPS");
    }
    public void showDirection() {
        if (this.navigation != null) {
            this.navigation.startNavigation();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
