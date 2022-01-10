package challenges;

public class ChallengeToMethods {
    public static void main(String[] args) {
        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Carol", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Frank", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Berry", playerPosition);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position: "
                + playerPosition + " on the high score table ");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
