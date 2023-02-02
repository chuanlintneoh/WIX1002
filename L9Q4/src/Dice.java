import java.util.*;
public class Dice {
    protected static Scanner sc = new Scanner(System.in);
    protected static Random rand = new Random();
    protected String name;
    protected int[] dice;
    protected int score = 0;
    public Dice(){
        System.out.print("Player Name: ");
        name = sc.nextLine();
    }
    protected int roll(){
        return rand.nextInt(6)+1;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
}
