public class MNCCompany {
    void hireEmployee() { System.out.println("Hiring a new employee."); }
    void fireEmployee() { System.out.println("Firing an employee."); }
    void conductMeeting() { System.out.println("Conducting a business meeting."); }
    void releaseProduct() { System.out.println("Releasing a new product."); }
    void expandToNewCountry() { System.out.println("Expanding to a new country."); }

    void interactWithICC(ICC icc) {
        icc.scheduleMatch();
        icc.announceRankings();
        icc.introduceNewRule();
        icc.manageSponsors();
        icc.reviewMatchDecision();
    }

    void performOperations(ICC icc) {
        hireEmployee();
        fireEmployee();
        conductMeeting();
        releaseProduct();
        expandToNewCountry();
        interactWithICC(icc);
    }
}
