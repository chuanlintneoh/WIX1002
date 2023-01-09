import java.util.Scanner;
import java.util.Random;
public class multiplicationGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int score = 0;
        int result = checkMultiplication(rand.nextInt(13),rand.nextInt(13));
        while (result != 'E'){
            if (result == 'T'){
                score++;
            }
            result = checkMultiplication(rand.nextInt(13),rand.nextInt(13));
        }
        System.out.printf("Your score is %d",score);
    }
    public static char checkMultiplication(int x, int y){
        Scanner sc = new Scanner(System.in);
        int correctAns = x*y;
        System.out.println("Enter negative number to quit.");
        System.out.printf("%d x %d = ",x,y);
        int ans = sc.nextInt();
        if (ans < 0){
            return 'E';
        }
        else if (ans == correctAns){
            return 'T';
        }
        else {
            return 'F';
        }
    }
}
