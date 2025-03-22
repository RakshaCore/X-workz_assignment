package com.xworkz.classvariable.Clip;

public class Runner {
    public static void main(String[] args) {
        Clip clip1=new Clip();
        clip1.color="red";
        Clip clip2=new Clip();
        clip2.color="yellow";
        Clip clip3=new Clip();
        clip3.color="silver";
        Clip clip4=new Clip();
        clip4.color="gold";


        Clip[] clips={clip1,clip2,clip3,clip4};


        Pushpa pushpa=new Pushpa();
        pushpa.clip=clips;
        pushpa.useClip();
    }
}
