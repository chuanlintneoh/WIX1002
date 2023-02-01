import java.util.*;
public class Fraction {
    public Scanner sc = new Scanner(System.in);
    private int numerator;
    private int denominator;
    public Fraction (int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    private int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public void reduceFraction(){
        if(denominator != 0){
            int gcd = gcd(numerator,denominator);
            System.out.printf("Fraction in lowest terms: %d/%d\n",numerator/gcd,denominator/gcd);
        }
        else {
            System.out.println("Denominator cannot be 0! Invalid fraction.");
        }
    }
}
