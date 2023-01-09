import java.util.Random;
public class rand3 {
    public static void main(String[] args) {
        Random rand = new Random();
        double min = 10.00;
        double max = 50.00;
        double[] randNum = new double[3];
        double sum = 0;
        double average;

        for(int i = 0; i< randNum.length; i++){
            randNum[i] = Math.random() * ((max-min)+1)+ min;
            System.out.println("Random Number ("+ i +") = " + String.format("%.2f",randNum[i]));
            sum = sum + randNum[i];
        }

        average = sum/randNum.length;
        System.out.println("\nSum = " + String.format("%.2f",sum));
        System.out.println("Average = " + String.format("%.2f",average));
    }
}
