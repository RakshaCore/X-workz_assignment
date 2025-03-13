public class Lollipop {
    void makeSweet() { System.out.println("Making a sweet lollipop."); }
    void wrap() { System.out.println("Wrapping the lollipop."); }
    void addColor() { System.out.println("Adding color to the lollipop."); }
    void sell() { System.out.println("Selling the lollipop."); }
    void eat() { System.out.println("Eating the lollipop."); }

    void interactWithMNCCompany(MNCCompany mnc) {
        mnc.hireEmployee();
        mnc.fireEmployee();
        mnc.conductMeeting();
        mnc.releaseProduct();
        mnc.expandToNewCountry();
    }

    void performOperations(MNCCompany mnc) {
        makeSweet();
        wrap();
        addColor();
        sell();
        eat();
        interactWithMNCCompany(mnc);
    }
}
