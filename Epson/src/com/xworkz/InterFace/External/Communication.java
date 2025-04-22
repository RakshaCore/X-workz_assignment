package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Message;

public class Communication {
    private Message message;
    public Communication(Message message) {
        this.message = message;
        System.out.println("Running Communication");
    }
    public void send() {
        if (this.message != null) {
            this.message.sendMessage();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
