import java.util.Scanner;
public class carloanMonthly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Price of the car(RM): ");
        double P = sc.nextDouble();
        System.out.print("Down Payment(RM): ");
        double D = sc.nextDouble();
        System.out.print("Interest Rate(%): ");
        double R = sc.nextDouble();
        System.out.print("Loan duration(year): ");
        double Y = sc.nextDouble();

        double M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.println("\nMonthly payment(RM): " + String.format("%.2f",M));
    }
}
