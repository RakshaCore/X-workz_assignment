package com.xworkz.afterYudagi.Internal;

public class Guitar extends MusicInstrument{
    public Guitar() {
        System.out.println("No-argument constructor: Guitar");
    }
    @Override
    public void play() {
        System.out.println("Playing music instrument");
    }
@Override
    public void tune() {
        System.out.println("Tuning the instrument");
    }
@Override
    public void sound() {
        System.out.println("Instrument makes a sound");
    }
@Override
    public void maintenance() {
        System.out.println("Instrument requires maintenance");
    }
@Override
    public void type() {
        System.out.println("Instrument type: String, Wind, Percussion");
    }
}
