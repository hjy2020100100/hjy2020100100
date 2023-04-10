package cn.edu.jnu.x2020100100;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;
    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void test10twos()
    {
        BowlingGame game=new BowlingGame();
        RepeatedRoll(game, 2, 20);
        assertEquals(40,game.score());
    }
    @Test
    public void test20threes()
    {
        RepeatedRoll(game, 3,20);
        assertEquals(60,game.score());
    }

    private void RepeatedRoll(BowlingGame game, int pin, int times) {
        for(int i=0;i<times;i++)
        {
            game.roll(pin);
        }
    }
    @Test
    public void testASpare()
    {
        rollASpare();
        game.roll(7);
        RepeatedRoll(game, 0,17);
        assertEquals(24,game.score());
    }

    private void rollASpare() {
        game.roll(2);
        game.roll(8);
    }
    @Test
    public void testAStrike()
    {
        rollAStrike(game, 10);
        game.roll(4);
        game.roll(7)
        RepeatedRoll(game, 0,16);
        assertEquals(32,game.score());
    }

    private void rollAStrike(BowlingGame game, int pin) {
        game.roll(pin);
    }

}