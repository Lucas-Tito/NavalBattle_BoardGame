package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Player.Player;

public class ShotTest {
    @Test
    public void testShot(){
        Player player = new Player("player");

        //what happens when we provide a wrong row and colum?
        assertEquals("testando coluna inválida","coluna inválida", player.isTheShotValid(new int[]{1,6}));

        assertEquals("testando coluna e linha inválida","linha e coluna inválida", player.isTheShotValid(new int[]{0,6}));

        assertEquals("testando linha inválida","linha inválida", player.isTheShotValid(new int[]{6,1}));
    }
}
