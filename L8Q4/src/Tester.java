import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();
        Fraction a = new Fraction(numerator,denominator);
        System.out.println("Numerator: " + a.getNumerator());
        System.out.println("Denominator: " + a.getDenominator());
        a.reduceFraction();
    }
}
