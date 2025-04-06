package com.xworkz.afterYudagi.Internal;

public class VirtualPetAdoption extends PetAdoption{
    public VirtualPetAdoption() {
        System.out.println("Virtual Pet Adoption System Activated");
    }
    @Override
    public void browseAvailablePets() {
        System.out.println("Browsing available pets for adoption");
    }
    @Override
    public void checkAdoptionRequirements() {
        System.out.println("Checking adoption requirements for a pet");
    }
    @Override
    public void scheduleMeetAndGreet() {
        System.out.println("Scheduling meet-and-greet session with a pet");
    }
    @Override
    public void finalizeAdoption() {
        System.out.println("Finalizing pet adoption process");
    }
    @Override
    public void provideCareGuidelines() {
        System.out.println("Providing care guidelines for the adopted pet");
    }
}
