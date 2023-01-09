import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class dicegreater100_winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[2];
        for (int i = 0; i < name.length; i++){
            System.out.printf("Name of player %d: ",i+1);
            name[i] = sc.nextLine();
        }
        int sum1 = 0, sum2 = 0;
        ArrayList<Integer> score1 = new ArrayList();
        ArrayList<Integer> score2 = new ArrayList();
        int counter1 = 0, counter2 = 0;
        while (sum1 < 100 && sum2 < 100){
            score1.add(dicegreater100_winner.generate_randNum());
            sum1 = dicegreater100_winner.playerScore(sum1, score1.get(counter1));
            counter1++;
            while (score1.get(counter1-1) == 6){
                score1.add(dicegreater100_winner.generate_randNum());
                sum1 = dicegreater100_winner.playerScore(sum1, score1.get(counter1));
                counter1++;
            }
            score2.add(dicegreater100_winner.generate_randNum());
            sum2 = dicegreater100_winner.playerScore(sum2, score2.get(counter2));
            counter2++;
            while (score2.get(counter2-1) == 6){
                score2.add(dicegreater100_winner.generate_randNum());
                sum2 = dicegreater100_winner.playerScore(sum2, score2.get(counter2));
                counter2++;
            }
        }

        System.out.printf("\n%s\n",name[0]);
        for (int i = 0; i < score1.size(); i++){
            System.out.printf("Round %d: %d \n",i+1,score1.get(i));
        }
        System.out.printf("Total score: %d\n",sum1);
        System.out.printf("\n%s\n",name[1]);
        for (int i = 0; i < score2.size(); i++){
            System.out.printf("Round %d: %d \n",i+1,score2.get(i));
        }
        System.out.printf("Total score: %d\n",sum2);


        if (sum1 != sum2){
            int winnerSum = 0;
            String winner;
            if (sum1 > sum2){
                winnerSum = sum1;
                winner = name[0];
            }
            else {
                winnerSum = sum2;
                winner = name[1];
            }
            System.out.printf("\nThe winner is %s, with the total score of %d.",winner,winnerSum);
        }
        else {
            System.out.println("The game is drawn.");
        }
    }
    public static int generate_randNum(){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
    public static int playerScore(int a, int b){
        return a + b;
    }
}
//        System.out.println("\nPlayer 1 \t Player 2");
//        if (score1.size() >= score2.size()){
//            for (int i = 0; i < score1.size(); i++){
//                System.out.printf("\t%d \t\t\t %d \n",score1.get(i),score2.get(i));
//            }
//        }
//        else {
//            for (int i = 0; i < score2.size(); i++){
//                System.out.printf("\t%d \t\t\t %d \n",score1.get(i),score2.get(i));
//            }
//        }
//          System.out.printf("   %d \t\t\t %d \n",sum1,sum2);