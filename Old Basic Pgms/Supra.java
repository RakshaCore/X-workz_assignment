public class Supra {
    void accelerate() { System.out.println("Accelerating the Supra."); }
    void brake() { System.out.println("Applying brakes."); }
    void drift() { System.out.println("Drifting the Supra!"); }
    void startEngine() { System.out.println("Starting the engine."); }
    void displaySpeed() { System.out.println("Displaying the speedometer."); }

    void interactWithIcecream(Icecream icecream) {
        icecream.melt();
        icecream.freeze();
        icecream.addFlavor();
        icecream.mixToppings();
        icecream.serve();
    }

    void performOperations(Icecream icecream) {
        accelerate();
        brake();
        drift();
        startEngine();
        displaySpeed();
        interactWithIcecream(icecream);
    }
}
