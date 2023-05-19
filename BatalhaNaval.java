

import Player.Player;

public class batalhaNaval {

    public static void main(String[] args) {
        
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
                    *then, it's verified if the coordinate was previously chosen
                    *then, the board is updated with the player shot
                    *finally, if it's a hit, hitWasScored turn to true and the point is stored in player
                 */
                int[] shot = player1.darTiro();
                if(player2.getBoard().coordinateIsRepeated(shot)){
                    do{
                        System.out.println("Voce ja bombardeou esta coordenada, escolha outra!");
                        shot = player1.darTiro();
                    }
                    while(player2.getBoard().coordinateIsRepeated(shot));
                }
                else{
                    hitWasScored = player2.updateBoard(shot);
                }
                
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


