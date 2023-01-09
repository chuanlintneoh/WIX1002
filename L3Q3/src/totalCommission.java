import java.util.Scanner;
public class totalCommission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sales volume(RM): ");
        double vol = sc.nextDouble();
        double rate;
        double commission;

        if (vol < 0){
            System.out.println("Invalid Sales Volume! Please try again!");
        }
        else if (vol <= 100){
            rate = 5;
            commission = totalCommission.calc(vol,rate);
            totalCommission.print(rate,commission);
        }
        else if (vol <= 500){
            rate = 7.5;
            commission = totalCommission.calc(vol,rate);
            totalCommission.print(rate,commission);
        }
        else if (vol <= 1000){
            rate = 10;
            commission = totalCommission.calc(vol,rate);
            totalCommission.print(rate,commission);
        }
        else {
            rate = 12.5;
            commission = totalCommission.calc(vol,rate);
            totalCommission.print(rate,commission);
        }
    }
    static double calc(double a, double b){
        return a*(b/100);
    }
    static void print(double a, double b){
        System.out.printf("Rate: %.1f%% of total sales",a);
        System.out.printf("\nTotal Commission: RM %.2f",b);
    }
}
