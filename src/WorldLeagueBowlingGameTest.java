import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Leagues.WorldLeagueScorer;

public class WorldLeagueBowlingGameTest {
    
    @Test
    public void allGuttersGameScoreShouldBeZero() {
        Game game = new Game(new WorldLeagueScorer());
        rollMany(game,20, 0); 

        assertEquals(0, game.score());
    }

    // todo: implement test allOnesGameShouldScoreTwenty
    // todo: implement test spareShouldGetFirstRollBonus, such that roles 5, 5, 3 = 18
    // todo: implement test strikeShouldGetThirtyNoBonus, such that roles X, 2, 7 = 39
    // todo: implement test perfectGameShouldGetPerfectScore, such that 10 roles of X = 300

    /**
     * For many rolls, record a number of pins per roll in a game
     * @param game Game to repeat rolls in
     * @param rolls Number of rolls to repeat
     * @param pins Number of pins per roll to record
     */
    private static void rollMany(Game game, int rolls, int pins) {
        for(int roll = 0; roll < rolls; roll++){
            game.roll(pins);
        }
    }
}
