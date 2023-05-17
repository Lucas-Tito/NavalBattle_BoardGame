package Player;
import java.util.Scanner;

public class Player {
    String name;
    int attempts=0, hitsScored=0;
    Board board = new Board();
    int[] shot = new int[2];

    public Player(String name){
        this.name = name;
    }

    public int[] darTiro(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Linha: ");
        shot[0] = input.nextInt();
        shot[0]--;
        
        System.out.print("Coluna: ");
        shot[1] = input.nextInt();
        shot[1]--;
        
        if(isTheShotValid(shot).equals("ok"))
            return shot;
        else
            return null;
    }

    public String isTheShotValid(int[] shot){
        
        if(shot[0]>5 || shot[0]<=0){
            if(shot[1]>5 || shot[1]<=0)
                return "linha e coluna inválida";

            return "linha inválida";
        }

        else if(shot[1]>5 || shot[1]<=0){
            if(shot[0]>5 || shot[0]<=0)
                return "linha e coluna inválida";

                return "coluna inválida";
        }
            
        return "ok";
    }

    public void increaseAttempts(){
        attempts++;
    }

    public void increaseHitsScored(){
        hitsScored++;
    }

    public int getHitsScored(){
        return hitsScored;
    }

    public int getAttempts() {
        return attempts;
    }

    public boolean updateBoard(int[] shot) {
        return board.updateBoard(shot);
    }

    public Board getBoard() {
        return board;
    }

    public String getName() {
        return name;
    }
}
