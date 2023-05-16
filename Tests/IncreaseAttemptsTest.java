package Tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Player.Player;

public class IncreaseAttemptsTest {
    @Test
    public void testShot() {
        Player player1 = new Player("PLAYER 1");
        
        player1.increaseAttempts();
        assertEquals(1, player1.getAttempts());
    }
}
