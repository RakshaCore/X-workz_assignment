class TubeLight {
    public static void turnOn(boolean isOn) {
        System.out.println("Is the tube light turned on? " + isOn);
    }

    public static void turnOff(boolean isOff) {
        System.out.println("Is the tube light turned off? " + isOff);
    }

    public static void adjustBrightness(int level) {
        System.out.println("Adjusting tube light brightness to level " + level + ".");
    }

    public static void setColor(String color) {
        System.out.println("Setting tube light color to " + color + ".");
    }

    public static void changeMode(String mode, int duration) {
        System.out.println("Changing tube light to " + mode + " mode for " + duration + " minutes.");
    }

    public static void replaceTubeLight(boolean isReplaced, String reason, String newModel) {
        System.out.println("Is the tube light replaced? " + isReplaced + ", Reason: " + reason + ", New Model: " + newModel + ".");
    }

    public static void flickerEffect(boolean flickering, int frequency, String cause) {
        System.out.println("Is the tube light flickering? " + flickering + ", Frequency: " + frequency + " times per second, Cause: " + cause + ".");
    }

    public static void main(String[] args) {
        // Testing the methods
        turnOn(true);
        turnOff(false);
        adjustBrightness(75);
        setColor("Cool White");
        changeMode("Night", 60);
        replaceTubeLight(true, "Damaged starter", "LED TubeLight 24W");
        flickerEffect(false, 0, "Stable power supply");
    }
}
