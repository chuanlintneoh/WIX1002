import java.util.*;
public class Game {
    private Scanner sc = new Scanner(System.in);
    private Random rand = new Random();
    private String name;
    private int dice;
    private int sum;
    public Game(){
        System.out.print("Enter player name: ");
        name = sc.nextLine();
    }
    public void move(){
        dice = rand.nextInt(6) + 1;
        System.out.printf("Rolling dice for %s... It's a %d!\n",name,dice);
        sum();
    }
    private void sum(){
        sum += dice;
    }
    public int getSum(){
        return sum;
    }
    public String getName(){
        return name;
    }
}
