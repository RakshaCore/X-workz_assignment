package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Animal;
import com.xworkz.InterFace.Internal.Event;

public class Aakriti {
    private Event event;
     public Aakriti(Event event) {
         this.event = event;
         System.out.println("Running Aakriti");
     }
        public void showEvent() {
            if (this.event != null) {
                this.event.coordinateEvent();
            } else {
                System.err.println("NULLLLL");
            }
        }
}
