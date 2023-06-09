

import Player.Player;

public class batalhaNaval {

    public static void main(String[] args) {
        
        Player player1 = new Player("PLAYER 1");
        Player player2 = new Player("PLAYER 2");
        //current player stores the player that is currently shooting
        Player currentPlayer = player1;
        Player enemyPlayer = player2;
        
        System.out.println();
        do{
            System.out.println(currentPlayer.getName());
            boolean hitWasScored = false;
            
            //discover who is the player current playing
            
            System.out.println(enemyPlayer.getBoard());

            /*
                *first, it's processed where the player wants to shoot
                *then, it's verified if the coordinate was previously chosen and if the coordinate is in bounds
                *then, the board is updated with the player shot
                *finally, if it's a hit, hitWasScored turn to true and the point is stored in player
                */
            int[] shot = currentPlayer.darTiro();
            System.out.println(shot);

            if(!currentPlayer.isTheShotValid(shot).equals("ok")){
                do{
                    System.out.println(currentPlayer.isTheShotValid(shot));       
                    shot = currentPlayer.darTiro();
                }
                while(!currentPlayer.isTheShotValid(shot).equals("ok"));
            }


            if(enemyPlayer.getBoard().coordinateIsRepeated(shot)){
                do{
                    System.out.println("Voce ja bombardeou esta coordenada, escolha outra!");     
                    shot = currentPlayer.darTiro();
                }
                while(enemyPlayer.getBoard().coordinateIsRepeated(shot));
            }

            else{
                hitWasScored = enemyPlayer.updateBoard(shot);
            }

            //stores the hits scored and attempts
            if(hitWasScored){
                currentPlayer.increaseHitsScored();
                System.out.println("Você acertou um navio!");
            }
            currentPlayer.increaseAttempts();

            //change player current playing
            if(currentPlayer.equals(player1)){
                currentPlayer = player2;
                enemyPlayer = player1;
            }
            else{
                currentPlayer = player1;
                enemyPlayer = player2;
            }
                
            
        }while(player1.getHitsScored()!=3 && player2.getHitsScored()!=3);
        
        System.out.println("\n\n\nJogo terminado. Você acertou os 3 navios em "+currentPlayer.getAttempts()+" tentativas");
    }

}


