

import Player.Player;

public class BatalhaNaval {

    public static void main(String[] args) {
        Player p = new Player();
        Player player1 = new Player("PLAYER 1");
        Player player2 = new Player("PLAYER 2");
        //current player stores the player that is currently shooting
        Player currentPlayer = player1;
        
        System.out.println();
        do{
            System.out.println(currentPlayer.getName());
            boolean hitWasScored = false;
            
            //discover who is the player current playing
            if(currentPlayer.equals(player1)){
                System.out.println(player2.getBoard());
                /*
                    *first, it's processed where the player wants to shoot
                    *then, the board is updated with the player shot
                    *finally, if it's a hit, hitWasScored turn to true and the point is stored in player
                 */
                hitWasScored = player2.updateBoard(player1.darTiro());
            }
            else{
                System.out.println(player1.getBoard());
                hitWasScored = player1.updateBoard(player2.darTiro());
            }

            //stores the hits scored and attempts
            if(hitWasScored){
                currentPlayer.increaseHitsScored();
                System.out.println("Você acertou um navio!");
            }
                
            currentPlayer.increaseAttempts();

            //change player current playing
            if(currentPlayer.equals(player1))
                currentPlayer=player2;
            else
                currentPlayer=player1;
            
        }while(player1.getHitsScored()!=3 && player2.getHitsScored()!=3);
        
        System.out.println("\n\n\nJogo terminado. Você acertou os 3 navios em "+currentPlayer.getAttempts()+" tentativas");
    }

}


