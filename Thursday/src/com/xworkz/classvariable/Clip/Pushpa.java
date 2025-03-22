package com.xworkz.classvariable.Clip;

public class Pushpa {
    Clip[] clip;
    void useClip()
    {
        for(Clip ref:clip)
        {
            if(ref!=null)
            {
                ref.hold();
                ref.displayColor();
            }
            else
                System.out.println("Pointing to null");
        }
    }
}
