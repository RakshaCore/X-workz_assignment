package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Map;

public class GoogleMap
{
    private Map map;
    public GoogleMap(Map map) {
        this.map = map;
        System.out.println("Running GoogleMap");
    }
    public void getDirections() {
        if (this.map != null) {
            this.map.getLocation();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
