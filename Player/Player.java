package Player;
import java.util.Arrays;
import java.util.Scanner;

public class Player {
    String name;
    int attempts=0, hitsScored=0;
    Board board = new Board();
    int[] shot = new int[2];

    public Player(String name){
        this.name = name;
    }

    public Player(){}

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
        else{
            return null;
        }

    }

    public String isTheShotValid(int[] shot){
        
        if(shot[0]>4 || shot[0]<0){
            if(shot[1]>4 || shot[1]<0)
                return "linha e coluna inválida";

            return "linha inválida";
        }

        else if(shot[1]>4 || shot[1]<0){
            if(shot[0]>4 || shot[0]<0)
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

    //Falta testar
    public boolean updateBoard(int[] shot) {
        return board.updateBoard(shot);
    }

    public Board getBoard() {
        return board;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttempts(int attempts) {
        if(attempts != 0)
            this.attempts = attempts;
    }

    public void setHitsScored(int hitsScored) {
        this.hitsScored = hitsScored;
    }


    public void setShot(int[] shot) {
        this.shot = shot;
    }
}
