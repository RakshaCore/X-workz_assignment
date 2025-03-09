public class Atom {
    void split() { System.out.println("Splitting an atom."); }
    void fuse() { System.out.println("Fusing atoms together."); }
    void changeState() { System.out.println("Changing state of the atom."); }
    void emitRadiation() { System.out.println("Emitting radiation."); }
    void formBond() { System.out.println("Forming atomic bonds."); }

    public static void main(String[] args) {
        Lollipop lollipop = new Lollipop();
        MNCCompany mnc = new MNCCompany();
        ICC icc = new ICC();
        RCB rcb = new RCB();
        IplCup cup = new IplCup();
        Globe globe = new Globe();
        Supra supra = new Supra();
        Icecream icecream = new Icecream();
        Atom atom = new Atom();

        lollipop.performOperations(mnc);
        mnc.performOperations(icc);
        icc.performOperations(rcb);
        rcb.performOperations(cup);
        cup.performOperations(globe);
        globe.performOperations(supra);
        supra.performOperations(icecream);
        icecream.performOperations(atom);
    }
}
