public class game1 extends Dice{
    public game1(){
        dice = new int[3];
    }
    public void play(){
        System.out.printf("Player: %s | Current score: %d\n",name,getScore());
        dice[0] = roll();
        dice[1] = roll();
        System.out.printf("Dice 1: %d | Dice 2: %d\n",dice[0],dice[1]);
        score += (dice[0]+dice[1]);
        if (dice[0] == dice[1]){
            dice[2] = roll();
            System.out.printf("Extra Roll! Dice: %d\n",dice[2]);
            score += dice[2];
        }
    }//1 turn
}