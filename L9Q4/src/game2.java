public class game2 extends Dice{
    public game2(){
        dice = new int[2];
    }
    public void play(){
        System.out.printf("Player: %s | Current score: %d\n",name,getScore());
        dice[0] = roll();
        System.out.printf("Dice: %d\n",dice[0]);
        if (score + dice[0] <= 100){
            score += dice[0];
            if (dice[0] == 6){
                dice[1] = roll();
                System.out.printf("Extra roll! Dice: %d\n",dice[1]);
                if (dice[1] != 6 && score+dice[1] <= 100){
                    score += dice[1];
                }
                else {
                    System.out.println("Ouch, wasted dice roll!");
                }
            }
        }
        else {
            System.out.println("Score surpassed 100! Turn cancelled.");
        }
    }//1 turn
}
