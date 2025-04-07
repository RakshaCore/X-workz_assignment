package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.AIBloodDonationManagement;
import com.xworkz.afterYudagi.Internal.BloodDonation;

public class Khoon {
    public void Blood(BloodDonation donation)
    {
        donation.registerDonor();
        donation.checkEligibility();
        donation.scheduleDonation();
        donation.trackBloodInventory();
        donation.notifyEmergencyRequests();

        if(donation instanceof AIBloodDonationManagement)
        {
            AIBloodDonationManagement aiBloodDonationManagement=(AIBloodDonationManagement) donation;
            aiBloodDonationManagement.call();
        }
    }
}
