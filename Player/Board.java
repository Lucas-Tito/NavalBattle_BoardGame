package Player;

public class Board {
    int[][] board = new int[5][5];
    Ships ships = new Ships();

    public Board(){
        for(int l=0 ; l < 5 ; l++ )
            for(int r=0 ; r < 5 ; r++ )
                board[l][r]=-1;
    }
    

    /*  
        * returns true when the player scores a hit 
        * used to keep track of player hits on player class
    */
    public boolean updateBoard(int[] shot){
        if(ships.hitWasTaken(shot)){
            board[shot[0]][shot[1]]=1;
            return true;
        }
        else
            board[shot[0]][shot[1]]=0; 

        return false;  
    }

    public boolean coordinateIsRepeated(int[] shot){
        if(board[shot[0]][shot[1]]!=-1){
            return true;
        }

        return false;
    }

    @Override
    public String toString(){
        String output = "\t1 \t2 \t3 \t4 \t5";

        output += "\n";
        
        for(int l=0 ; l < 5 ; l++ ){
            output += (l+1)+"";

            for(int r=0 ; r < 5 ; r++ ){
                if(board[l][r]==-1){
                    output += "\t"+"~";
                }else if(board[l][r]==0){
                    output += "\t"+"*";
                }else if(board[l][r]==1){
                    output += "\t"+"X";
                }
                
            }
            output += "\n";
        }

        return output;
    }
}
