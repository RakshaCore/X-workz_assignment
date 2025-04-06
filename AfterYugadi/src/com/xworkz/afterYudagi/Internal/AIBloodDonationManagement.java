package com.xworkz.afterYudagi.Internal;

public class AIBloodDonationManagement extends BloodDonation{
    public AIBloodDonationManagement() {
        System.out.println("AI-Powered Blood Donation Management System Activated");
    }
@Override
    public void registerDonor() {
        System.out.println("Registering blood donor");
    }
@Override
    public void checkEligibility() {
        System.out.println("Checking donor eligibility");
    }
@Override
    public void scheduleDonation() {
        System.out.println("Scheduling blood donation appointment");
    }
@Override
    public void trackBloodInventory() {
        System.out.println("Tracking available blood inventory");
    }
@Override
    public void notifyEmergencyRequests() {
        System.out.println("Notifying donors for emergency blood requests");
    }
}
