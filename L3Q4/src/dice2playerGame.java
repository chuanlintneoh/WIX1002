import java.util.Scanner;
import java.util.Random;
import javax.swing.*;
public class dice2playerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] name = new String[2];
        int[] score_1 = new int[2];
        int[] score_2 = new int[2];
        int[] scoreSum = new int[2];

        for (int i = 0; i < name.length; i++){
            System.out.printf("Name of player %d: ",(i+1));
            name[i] = sc.nextLine();
        }
        System.out.println("\n            \t Player 1 \t\t\t Player 2");
        for (int i = 0; i < score_1.length; i++){
            score_1[i] = rand.nextInt(6)+1;
        }
        for (int i = 0; i < score_2.length; i++){
            score_2[i] = rand.nextInt(6)+1;
        }
        for (int i = 0; i < scoreSum.length; i++){
            scoreSum[i] = score_1[i] + score_2[i];
        }
        System.out.printf("First round \t %d \t\t\t\t\t %d",score_1[0],score_1[1]);
        System.out.printf("\nSecond round\t %d \t\t\t\t\t %d",score_2[0],score_2[1]);
        System.out.printf("\nTotal       \t %d \t\t\t\t\t %d",scoreSum[0],scoreSum[1]);
        int highestScore = 0;
        String winner = "\nNo winner, the game is drawn.";
        if (scoreSum[0] == scoreSum[1]){
            highestScore = scoreSum[0];
        }
        else {
            for (int i = 0; i < scoreSum.length; i++) {
                if (scoreSum[i] > highestScore) {
                    winner = name[i];
                    highestScore = scoreSum[i];
                }
            }
        }
        if (winner != "\nNo winner, the game is drawn."){
            System.out.printf("\nThe winner is %s with a score of %d.",winner,highestScore);
        }
        else {
            System.out.println(winner);
            System.out.printf("The score is tied at %d.",highestScore);
        }
    }
}