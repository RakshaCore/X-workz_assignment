public class RCB {
    void signPlayer() { System.out.println("Signing a new player."); }
    void releasePlayer() { System.out.println("Releasing a player."); }
    void trainPlayers() { System.out.println("Training the players."); }
    void playMatch() { System.out.println("Playing an IPL match."); }
    void reviewPerformance() { System.out.println("Reviewing the team's performance."); }

    void interactWithIplCup(IplCup cup) {
        cup.startTournament();
        cup.scheduleMatches();
        cup.declareWinner();
        cup.handleSponsorships();
        cup.distributePrizeMoney();
    }

    void performOperations(IplCup cup) {
        signPlayer();
        releasePlayer();
        trainPlayers();
        playMatch();
        reviewPerformance();
        interactWithIplCup(cup);
    }
}
