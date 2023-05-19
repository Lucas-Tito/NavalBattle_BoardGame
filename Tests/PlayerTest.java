package Tests;

import org.junit.Test;

import Player.Board;
import Player.Player;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void shotTest()
    {
        Player player = new Player("player");

        //what happens when we provide a wrong row and colum?
        assertEquals("testando coluna inválida","coluna inválida", player.isTheShotValid(new int[]{1,6}));

        assertEquals("testando coluna e linha inválida","linha e coluna inválida", player.isTheShotValid(new int[]{-1,6}));

        assertEquals("testando linha inválida","linha inválida", player.isTheShotValid(new int[]{6,1}));
    }

    @Test
    public void IncreaseAttemptsTest()
    {
        Player player1 = new Player("PLAYER 1");

        player1.increaseAttempts();
        assertEquals(1, player1.getAttempts());
    }

    @Test
    public void increaseHitsScoredTest()
    {
        Player player1 = new Player("PLAYER 1");

        player1.increaseHitsScored();
        assertEquals(1, player1.getHitsScored());
    }

    @Test
    public void getHitsScoredTest(){
        Player player1 = new Player("PLAYER 1");
        assertEquals(0,player1.getHitsScored());
    }

    @Test
    public void getAttemptsTest() {
        Player player1 = new Player("PLAYER 1");
        assertEquals(0,player1.getAttempts());
    }

    @Test
    public void setAttemptsTest() {
        Player player1 = new Player("PLAYER 1");
        player1.setAttempts(2);
    }


    @Test
    public void getBoardTest() {
        Player player1 = new Player("PLAYER 1");
        Board expectedBoard = new Board();
        Board playerBoard = player1.getBoard();
        String expectedBoardString = expectedBoard.toString();
        String playerBoardString = playerBoard.toString();
        assertEquals(expectedBoardString, playerBoardString);
    }

    @Test
    public void getNameTest() {
        Player player1 = new Player("PLAYER 1");
        assertEquals("PLAYER 1",player1.getName());
    }

    @Test
    public void setNameTest(){

        Player player1 = new Player();

        player1.setName("teste");
    }

    @Test
    public void setHitsScoredTest() {
        Player player1 = new Player();

        player1.setHitsScored(2);
    }

    @Test
    public void setShotTest() {
        Player player1 = new Player();

        player1.setShot(new int[]{1,2});
    }

}
