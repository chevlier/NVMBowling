

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
private BowlingGame game;

    protected void setUp() throws Exception {
        game = new BowlingGame();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            game.roll(pins);
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    public void testDummyGame() throws Exception {
            rollMany(20,0);
            assertEquals(0, game.score());
        }

    public void testAllGame() throws Exception {
            rollMany(20,3);
            assertEquals(60, game.score());
        }

    public void testOneSpare() throws Exception {
        rollSpare();
        game.roll(3);
        rollMany(17,0);
        assertEquals(16,game.score());
    }



}

