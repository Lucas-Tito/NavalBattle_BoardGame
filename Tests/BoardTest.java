package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Player.Board;

public class BoardTest {
    
    @Test
    public void UpdateBoardTest(){
        Board board = new Board();

        //assertEquals(true,board.updateBoard(new int[]{1,1}));
        assertEquals(false,board.updateBoard(new int[]{1,1}));

    }

    @Test
    public void coordinateIsRepeatedTest() {
        Board board = new Board();

        /*
         *first, a shot is registered on the board
         *then, it's checked if the coordinateIsRepeated method detects that the coordinate was already shot. 
        */
        board.updateBoard(new int[]{1,1});
        assertEquals(true, board.coordinateIsRepeated(new int[]{1,1}));
    }
}
