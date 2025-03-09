class Dmart {
    public static void enterStore(String customerName) {
        System.out.println(customerName + " entered Dmart.");
    }

    public static void buyItem(String itemName, int quantity, double price) {
        System.out.println("Bought " + quantity + " " + itemName + "(s) for ₹" + (quantity * price) + ".");
    }

    public static void checkDiscount(String itemName, int discountPercentage) {
        System.out.println("Discount on " + itemName + " is " + discountPercentage + "%.");
    }

    public static void billPayment(double amount, String paymentMethod) {
        System.out.println("Paid ₹" + amount + " using " + paymentMethod + ".");
    }

    public static void askForAssistance(String section, String query) {
        System.out.println("Requested assistance in " + section + " section for: " + query);
    }

    public static void returnItem(String itemName, int quantity, String reason) {
        System.out.println("Returned " + quantity + " " + itemName + "(s) due to " + reason + ".");
    }

    public static void exitStore(String customerName) {
        System.out.println(customerName + " exited Dmart.");
    }

    public static void main(String[] args) {
        // Testing the methods
        enterStore("Raksha");
        buyItem("Milk", 2, 50);
        checkDiscount("Rice", 10);
        billPayment(500, "Credit Card");
        askForAssistance("Electronics", "Looking for a good mixer grinder.");
        returnItem("Shampoo", 1, "Wrong product delivered");
        exitStore("Raksha");
    }
}
