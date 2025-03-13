public class Globe {
    void rotate() { System.out.println("Rotating the globe."); }
    void tiltAxis() { System.out.println("Tilting the axis of the globe."); }
    void displayCountries() { System.out.println("Displaying all countries on the globe."); }
    void showLatitudeLongitude() { System.out.println("Showing latitude and longitude."); }
    void simulateClimateChange() { System.out.println("Simulating climate change."); }

    void interactWithSupra(Supra supra) {
        supra.accelerate();
        supra.brake();
        supra.drift();
        supra.startEngine();
        supra.displaySpeed();
    }

    void performOperations(Supra supra) {
        rotate();
        tiltAxis();
        displayCountries();
        showLatitudeLongitude();
        simulateClimateChange();
        interactWithSupra(supra);
    }
}
