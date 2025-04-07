package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.PetAdoption;
import com.xworkz.afterYudagi.Internal.VirtualPetAdoption;

public class Sheru {
    public void dog(PetAdoption adoption)
    {
        adoption.browseAvailablePets();
        adoption.checkAdoptionRequirements();
        adoption.scheduleMeetAndGreet();
        adoption.finalizeAdoption();
        adoption.provideCareGuidelines();

        if(adoption instanceof VirtualPetAdoption)
        {
            VirtualPetAdoption virtualPetAdoption=(VirtualPetAdoption)adoption;
            virtualPetAdoption.nameit();
        }
    }
}
