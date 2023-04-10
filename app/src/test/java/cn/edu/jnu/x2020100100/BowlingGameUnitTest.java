package cn.edu.jnu.x2020100100;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    @Test
    public void test10twos()
    {
        BowlingGame game=new BowlingGame();
        for(int i=0;i<20;i++)
        {
            game.roll(10);
        }
        assertEquals(40,game.score());
    }
}