public class IplCup {
    void startTournament() { System.out.println("Starting the IPL tournament."); }
    void scheduleMatches() { System.out.println("Scheduling all IPL matches."); }
    void declareWinner() { System.out.println("Declaring the IPL winner."); }
    void handleSponsorships() { System.out.println("Handling sponsorships for the IPL."); }
    void distributePrizeMoney() { System.out.println("Distributing the prize money."); }

    void interactWithGlobe(Globe globe) {
        globe.rotate();
        globe.tiltAxis();
        globe.displayCountries();
        globe.simulateClimateChange();
        globe.showLatitudeLongitude();
    }

    void performOperations(Globe globe) {
        startTournament();
        scheduleMatches();
        declareWinner();
        handleSponsorships();
        distributePrizeMoney();
        interactWithGlobe(globe);
    }
}
