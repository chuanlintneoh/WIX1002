import java.util.Scanner;
import java.util.Random;
public class numdigits_randNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter maximum of random number: ");
        int max = sc.nextInt();
        if (max <= 0){
            System.out.println("Invalid input! Please try again.");
        }
        else {
            int randNum = rand.nextInt(max);
            System.out.printf("Random number generated: %d",randNum);

            int numdigits_randNum = 1;
            while (randNum >= 10){
                randNum = randNum / 10;
                numdigits_randNum = numdigits_randNum + 1;
            }
            System.out.printf("\nNumber of digits: %d", numdigits_randNum);
        }
    }
}
