package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.Museum;
import com.xworkz.afterYudagi.Internal.VRMuseum;

public class NewVRMuseum {
    public void checkoutMuseum(Museum museum)
    {
        museum.displayArtifacts();
        museum.provideAudioGuide();
        museum.offerInteractiveTours();
        museum.hostLiveEvents();
        museum.manageMemberships();
        if( museum instanceof VRMuseum)
        {
            VRMuseum vrMuseum=(VRMuseum) museum;
            vrMuseum.feedback();
        }
    }
}
