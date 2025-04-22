package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Storage;

public class DataCenter {
    private Storage storage;
    public DataCenter(Storage storage) {
        this.storage = storage;
        System.out.println("Running DataCenter");
    }
    public void clear() {
        if (this.storage != null) {
            this.storage.clearStorage();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
