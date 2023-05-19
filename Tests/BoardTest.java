package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Player.Board;

public class BoardTest {
    
    @Test
    public void UpdateBoardTests(){
        Board board = new Board();

        //assertEquals(true,board.updateBoard(new int[]{1,1}));
        assertEquals(false,board.updateBoard(new int[]{1,1}));

    }
}
