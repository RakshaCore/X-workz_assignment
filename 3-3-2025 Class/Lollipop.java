class Lollipop {
    void unwrap() { System.out.println("Unwrapping lollipop"); }
    void eat() { System.out.println("Eating lollipop"); }
    void lick() { System.out.println("Licking lollipop"); }
    void breakLollipop() { System.out.println("Breaking lollipop"); }
    void throwStick() { System.out.println("Throwing stick away"); }
    
    void invokeMethods(Child child) {
        child.buyLollipop();
        child.shareLollipop();
        child.storeLollipop();
        child.discardWrapper();
        child.rateTaste();
    }
}