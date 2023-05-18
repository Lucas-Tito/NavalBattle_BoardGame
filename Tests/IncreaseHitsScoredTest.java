package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Player.Player;

public class IncreaseHitsScoredTest {
    @Test
    public void testHit(){
        Player player1 = new Player("PLAYER1");
        
        player1.increaseHitsScored();
        assertEquals(1, player1.getHitsScored());
    }

}
