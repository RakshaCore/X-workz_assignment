class Whiteboard {
    public static void writeOnBoard(String content) {
        System.out.println("Writing on the whiteboard: " + content + ".");
    }

    public static void eraseBoard(boolean isErased) {
        System.out.println("Is the whiteboard erased? " + isErased);
    }

    public static void checkBoardCleanliness(boolean isClean) {
        System.out.println("Is the whiteboard clean? " + isClean);
    }

    public static void setBoardSize(String size, String type) {
        System.out.println("Setting whiteboard size to " + size + " (" + type + " board).");
    }

    public static void moveBoard(String from, String to) {
        System.out.println("Moving whiteboard from " + from + " to " + to + ".");
    }

    public static void attachBoardAccessories(boolean hasMarkers, int erasers, String accessoryType) {
        System.out.println("Attaching accessories: Markers available? " + hasMarkers + ", Erasers: " + erasers + ", Type: " + accessoryType + ".");
    }

    public static void replaceBoard(boolean isReplaced, int duration, String reason) {
        System.out.println("Is the whiteboard replaced? " + isReplaced + ", replaced after " + duration + " months due to " + reason + ".");
    }

    public static void main(String[] args) {
        // Testing the methods
        writeOnBoard("Today's Agenda: Java Programming");
        eraseBoard(true);
        checkBoardCleanliness(true);
        setBoardSize("6x4 ft", "Magnetic");
        moveBoard("Meeting Room", "Training Hall");
        attachBoardAccessories(true, 2, "Magnet Holder");
        replaceBoard(false, 12, "wear and tear");
    }
}
