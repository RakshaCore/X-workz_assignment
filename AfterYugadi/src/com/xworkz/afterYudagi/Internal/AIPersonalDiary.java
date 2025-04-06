package com.xworkz.afterYudagi.Internal;

public class AIPersonalDiary extends PersonalDiary{
    public AIPersonalDiary() {
        System.out.println("AI-Powered Personal Diary Activated");
    }
    @Override
    public void writeEntry() {
        System.out.println("Writing a new diary entry");
    }
    @Override
    public void setReminders() {
        System.out.println("Setting reminders for personal tasks");
    }
    @Override
    public void analyzeMoodTrends() {
        System.out.println("Analyzing mood trends based on diary entries");
    }
    @Override
    public void encryptEntries() {
        System.out.println("Encrypting diary entries for privacy");
    }
    @Override
    public void suggestReflections() {
        System.out.println("Suggesting reflections based on past experiences");
    }
}
