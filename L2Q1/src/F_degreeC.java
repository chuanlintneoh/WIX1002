import java.util.Scanner;
public class F_degreeC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit(F): ");
        double F = sc.nextDouble();
        double C = (F - 32)/1.8;
        System.out.println("\nTemperature in degree Celsius(°C): " + String.format("%.2f",C));
    }
}
