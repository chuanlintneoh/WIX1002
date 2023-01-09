import java.util.Scanner;
public class arithmeticsrsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given series:");
        System.out.println("1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)");
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int seriesSum = 0;
        if (n > 0){
            int[] nthTerm = new int[n];
            nthTerm[0] = 0;

            for (int i = 0; i < n; i++){
                for (int counter = 0; counter <= i; counter++){
                    nthTerm[i] = nthTerm[i] + counter+1;
                }
                seriesSum = seriesSum + nthTerm[i];
            }
        }
        else if (n < 0){
            System.out.println("Invalid input! Please try again.");
        }
        if (n == 0||n > 0){
            System.out.printf("Sum of series: %d",seriesSum);
        }
    }
}
