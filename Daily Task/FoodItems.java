class FoodItems {
    public static void prepareFood(String foodName) {
        System.out.println("Preparing " + foodName + ".");
    }

    public static void serveFood(String foodName) {
        System.out.println("Serving " + foodName + ".");
    }

    public static void checkFreshness(boolean isFresh) {
        System.out.println("Is the food fresh? " + isFresh);
    }

    public static void setQuantity(int quantity, String unit) {
        System.out.println("Setting quantity to " + quantity + " " + unit + ".");
    }

    public static void moveFood(String from, String to) {
        System.out.println("Moving food from " + from + " to " + to + ".");
    }

    public static void storeFood(String foodName, int duration, String storageType) {
        System.out.println("Storing " + foodName + " for " + duration + " hours in " + storageType + ".");
    }

    public static void consumeFood(String foodName, int quantity, String eater) {
        System.out.println(eater + " is consuming " + quantity + " of " + foodName + ".");
    }

    public static void main(String[] args) {
        // Testing the methods
        prepareFood("Pasta");
        serveFood("Burger");
        checkFreshness(true);
        setQuantity(500, "grams");
        moveFood("Kitchen", "Dining Table");
        storeFood("Milk", 24, "Refrigerator");
        consumeFood("Pizza", 2, "John");
    }
}
