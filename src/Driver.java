/**
 * Simple driver class to run 5 iterations of the game.
 *
 */
public class Driver
{
    // How many games, in total, the program should play
    private static final int NUMBER_OF_GAMES = 5;

    /**
     * Main method for the Fate Game system
     * 
     * @param args
     *            command-line arguments [not used]
     */
    public static void main(String[] args)
    {
        // Create a new game and a running player's score
        Game game = new Game();
        int score = 0;

        // Generate a header to define the first game in the console
        System.out.println("********** GAME START **********");

        // Run 50 games.
        for (int i = 0; i < NUMBER_OF_GAMES; i++)
        {
            // Show the player their running total score
            System.out.println("Player's Current Total Score: " + score);

            // Play a single game, and add the score to the running sum.
            score += game.playOnce();
        }

        // Show the player their final score.
        System.out.println("********** GAME END **********");
        System.out.println("Player's Final Score: " + score);
    }
}
