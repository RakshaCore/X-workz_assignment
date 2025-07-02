package com.xworkz.satishbhaaaiop.exception;

import javax.sound.sampled.LineUnavailableException;

public class EventCreator {
    public void checkedEvent() throws LineUnavailableException {
        if(true){

            System.out.println("Hi Satish Bhaaai");
            throw new LineUnavailableException("Creating this to check exception");
        }
    }
    public void uncheckedEvent(){
        if (true)
        {
            System.out.println("Satttu Bhaii");
            throw new RuntimeException("What ya u no constructor only no man shiiii");
        }
    }
}
