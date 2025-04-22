package com.xworkz.InterFace.External;

import com.xworkz.InterFace.Internal.Reminder;

public class ReminderApp {
    private Reminder reminder;
    public ReminderApp(Reminder reminder) {
        this.reminder = reminder;
        System.out.println("Running ReminderApp");
    }
    public void setReminder() {
        if (this.reminder != null) {
            this.reminder.setReminder();
        } else {
            System.err.println("NULLLLL");
        }
    }

}
