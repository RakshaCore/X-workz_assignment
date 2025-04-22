package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Notification;

public class AlertSystem {
    private Notification notification;
    public AlertSystem(Notification notification) {
        this.notification = notification;
        System.out.println("Running AlertSystem");
    }
    public void sendAlert() {
        if (this.notification != null) {
            this.notification.viewNotifications();
        } else {
            System.err.println("NULLLLL");
        }
    }
}
