import java.util.Random;
public class sum_randDigit {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNum = rand.nextInt(10001);
        System.out.println("Random number generated: " + randNum);

        int digit_1 = randNum/10000;
        int digit_2 = (randNum - digit_1*10000)/1000;
        int digit_3 = (randNum - digit_1*10000 - digit_2*1000)/100;
        int digit_4 = (randNum - digit_1*10000 - digit_2*1000 - digit_3*100)/10;
        int digit_5 = (randNum - digit_1*10000 - digit_2*1000 - digit_3*100 - digit_4*10);

        int sum = digit_1 + digit_2 + digit_3 + digit_4 + digit_5;
        System.out.println("Sum of all digits in the number: " + sum);

    }
}
