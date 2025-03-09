class Paper {
    public static void writeOnPaper(String content) {
        System.out.println("Writing on paper: " + content + ".");
    }

    public static void printOnPaper(String document) {
        System.out.println("Printing document: " + document + " on paper.");
    }

    public static void checkPaperQuality(boolean isGoodQuality) {
        System.out.println("Is the paper of good quality? " + isGoodQuality);
    }

    public static void setPaperSize(String size, int weight) {
        System.out.println("Setting paper size to " + size + " with weight " + weight + " GSM.");
    }

    public static void movePaper(String from, String to) {
        System.out.println("Moving paper from " + from + " to " + to + ".");
    }

    public static void foldPaper(boolean fold, int times, String direction) {
        System.out.println("Is the paper folded? " + fold + ", folded " + times + " times in " + direction + " direction.");
    }

    public static void recyclePaper(boolean isRecycled, int sheets, String method) {
        System.out.println("Recycling paper? " + isRecycled + ", with " + sheets + " sheets using " + method + " method.");
    }

    public static void main(String[] args) {
        // Testing the methods
        writeOnPaper("Hello, World!");
        printOnPaper("Project Report");
        checkPaperQuality(true);
        setPaperSize("A4", 80);
        movePaper("Office", "Printer Room");
        foldPaper(true, 2, "horizontal");
        recyclePaper(true, 100, "shredding");
    }
}
