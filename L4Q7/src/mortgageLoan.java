import java.util.Scanner;
import java.lang.Math;
public class mortgageLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int N = sc.nextInt();
        double M = ((P*(i/(12*100)))/(1-Math.pow((1+(i/(12*100))),-N)));
        double[] C = new double[N];//Principal
        double[] L = new double[N];//Interest
        double[] R = new double[N];//Unpaid Balance
        double sum_L = 0;//Total Interest

        System.out.println("Month\t\tMonthly Payment\t\tPrincipal\t\tInterest\t\tUnpaid Balance\t\tTotal Interest");
        for (int counter = 1; counter <= N; counter++){
            C[counter-1] = M * Math.pow((1+i/(12*100)),-(1+N-counter));
            L[counter-1] = M - C[counter-1];
            R[counter-1] = L[counter-1]/(i/(12*100))-C[counter-1];
            sum_L = sum_L + L[counter-1];
            System.out.printf("%d\t\t\t\t\t%.2f\t\t%.2f\t\t\t%.2f\t\t\t\t%.2f\t\t\t\t%.2f\n",counter,M,C[counter-1],L[counter-1],R[counter-1],sum_L);
        }
    }
}
