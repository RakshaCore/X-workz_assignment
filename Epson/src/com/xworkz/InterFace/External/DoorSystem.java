package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Lock;

public class DoorSystem {
    private Lock lock;
    public DoorSystem(Lock lock) {
        this.lock = lock;
        System.out.println("Running DoorSystem");
    }
    public void lockDoor() {
        if (this.lock != null) {
            this.lock.lock();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
