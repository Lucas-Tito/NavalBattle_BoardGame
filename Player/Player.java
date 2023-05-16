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
        
        return shot;
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
