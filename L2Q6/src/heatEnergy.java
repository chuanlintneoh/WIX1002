import java.util.Scanner;
public class heatEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the energy of water in gram: ");
        int M_gram = sc.nextInt();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double ini_F = sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double fin_F = sc.nextDouble();

        double M = gram_kilogram(M_gram);
        double ini_C = F_degreeC(ini_F);
        double fin_C = F_degreeC(fin_F);

        double Q = M*(fin_C-ini_C)*4184;
        System.out.println("The energy needed is " + Q);

    }
    static double F_degreeC(double F){
        return (F - 32)/1.8;
    }
    static double gram_kilogram(double g){
        return g/1000;
    }
}
