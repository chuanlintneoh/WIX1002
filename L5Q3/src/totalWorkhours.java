import java.util.Random;
import java.util.Scanner;
public class totalWorkhours {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int N = sc.nextInt();
        int[][] work = new int[N][7];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 7; j++) {
                work[i][j] = 1 + rand.nextInt(8);
            }
        }

        System.out.println("\n              Su  Mo  Tu  We  Th  Fr  Sa ");
        for (int i = 0; i < work.length; i++) {
            System.out.print("Employee " + (i+1) + " ");
            for (int j = 0; j < 7; j++) {
                System.out.printf("%4d", work[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\nTotal Work Hours");
        for (int i = 0; i < work.length; i++) {
            System.out.print("Employee " + (i+1) + " : ");
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                sum += work[i][j];
            }
            System.out.println(sum);
        }
    }
}
/*
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("N: ");
        int n = sc.nextInt();
        int[] workHours = new int[7*n];
        for (int i = 0; i < workHours.length; i++){
            workHours[i] = 1 + rand.nextInt(7);
        }
        int sum = 0;
        for (int i = 0; i < workHours.length; i++){

        }
 */