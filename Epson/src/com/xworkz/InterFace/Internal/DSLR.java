package com.xworkz.InterFace.Internal;

public class DSLR implements Camera{

    @Override
    public void clickPhoto() {
        System.out.println("DSLR camera is clicking photo");
    }
}
