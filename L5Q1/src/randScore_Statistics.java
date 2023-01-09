import java.util.Random;
import java.util.Scanner;
public class randScore_Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("n: ");
        int n = sc.nextInt();
        int[] score = new int[n];
        if (n <= 0){
            System.out.println("Invalid input! Please try again.");
        }
        else {
            System.out.println("Scores generated: ");
            for (int i = 0; i < n; i++){
                score[i] = rand.nextInt(101);
                System.out.println(score[i]);
            }
            int highestScore = score[0];
            int lowestScore = highestScore;
            double sum = 0;
            for (int i = 0; i < n; i++){
                if (score[i] > highestScore){
                    highestScore = score[i];
                }
                else if (score[i] < lowestScore){
                    lowestScore = score[i];
                }
                sum = sum + score[i];
            }
            System.out.printf("\nHighest score: %d",highestScore);
            System.out.printf("\nLowest score: %d",lowestScore);
            System.out.printf("\nAverage score: %.2f",sum/n);
        }
    }
}
