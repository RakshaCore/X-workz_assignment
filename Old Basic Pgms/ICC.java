public class ICC {
    void scheduleMatch() { System.out.println("Scheduling an international match."); }
    void announceRankings() { System.out.println("Announcing team rankings."); }
    void introduceNewRule() { System.out.println("Introducing a new cricket rule."); }
    void manageSponsors() { System.out.println("Managing sponsors for the event."); }
    void reviewMatchDecision() { System.out.println("Reviewing a match decision."); }

    void interactWithRCB(RCB rcb) {
        rcb.signPlayer();
        rcb.releasePlayer();
        rcb.trainPlayers();
        rcb.playMatch();
        rcb.reviewPerformance();
    }

    void performOperations(RCB rcb) {
        scheduleMatch();
        announceRankings();
        introduceNewRule();
        manageSponsors();
        reviewMatchDecision();
        interactWithRCB(rcb);
    }
}
