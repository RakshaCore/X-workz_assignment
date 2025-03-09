class TeddyBear {
    public static void hugTeddy(String person) {
        System.out.println(person + " is hugging the teddy bear.");
    }

    public static void squeezeTeddy(boolean isSqueezed) {
        System.out.println("Is the teddy bear squeezed? " + isSqueezed);
    }

    public static void checkTeddySoftness(boolean isSoft) {
        System.out.println("Is the teddy bear soft? " + isSoft);
    }

    public static void setTeddySize(String size, String color) {
        System.out.println("Setting teddy bear size to " + size + " and color to " + color + ".");
    }

    public static void moveTeddy(String from, String to) {
        System.out.println("Moving teddy bear from " + from + " to " + to + ".");
    }

    public static void dressTeddy(boolean hasClothes, String outfitType, String accessory) {
        System.out.println("Dressing teddy bear: Has clothes? " + hasClothes + ", Outfit type: " + outfitType + ", Accessory: " + accessory + ".");
    }

    public static void replaceTeddy(boolean isReplaced, int age, String reason) {
        System.out.println("Is the teddy bear replaced? " + isReplaced + ", after " + age + " years due to " + reason + ".");
    }

    public static void main(String[] args) {
        // Testing the methods
        hugTeddy("Raksha");
        squeezeTeddy(true);
        checkTeddySoftness(true);
        setTeddySize("Large", "Brown");
        moveTeddy("Bed", "Couch");
        dressTeddy(true, "Winter Outfit", "Bow Tie");
        replaceTeddy(false, 5, "too old and torn");
    }
}
