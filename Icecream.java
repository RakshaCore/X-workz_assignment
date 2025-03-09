public class Icecream {
    void melt() { System.out.println("Melting the ice cream."); }
    void freeze() { System.out.println("Freezing the ice cream."); }
    void addFlavor() { System.out.println("Adding a new flavor."); }
    void mixToppings() { System.out.println("Mixing toppings."); }
    void serve() { System.out.println("Serving the ice cream."); }

    void interactWithAtom(Atom atom) {
        atom.split();
        atom.fuse();
        atom.changeState();
        atom.emitRadiation();
        atom.formBond();
    }

    void performOperations(Atom atom) {
        melt();
        freeze();
        addFlavor();
        mixToppings();
        serve();
        interactWithAtom(atom);
    }
}
