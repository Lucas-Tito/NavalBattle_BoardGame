package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Player.Player;

//does the attempts really do increase?
public class IncreaseAttemptsTest {
    @Test
    public void testAttempts() {
        Player player1 = new Player("PLAYER 1");
        
        player1.increaseAttempts();
        assertEquals(1, player1.getAttempts());
    }
}
