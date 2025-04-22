package com.xworkz.InterFace.Internal;

public class LockImpl implements Lock {

    @Override
    public void lock() {
        System.out.println("Lock is locked");
    }

}
