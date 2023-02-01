import java.util.*;
public class Number {
    public Random rand = new Random();
    private int n, max;
    private int[] num;
    public Number (){
        n = 10;
        num = new int[n];
        max = 100;
        for (int i = 0; i < num.length; i++){
            num[i] = rand.nextInt(max+1);
        }
    }
    public Number (int n){
        this.n = n;
        num = new int[n];
        max = 100;
        for (int i = 0; i < num.length; i++){
            num[i] = rand.nextInt(max+1);
        }
    }
    public Number (int n, int max){
        this.n = n;
        num = new int[n];
        this.max = max;
        for (int i = 0; i < num.length; i++){
            num[i] = rand.nextInt(max+1);
        }
    }
    public void displayArray(){
        System.out.println("Array numbers:");
        for (int i = 0; i < num.length; i++){
            System.out.printf(" %d ",num[i]);
        }
        System.out.println();
    }
    public void displayEven(){
        System.out.print("Even numbers:");
        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 == 0){
                System.out.printf(" %d ",num[i]);
            }
        }
        System.out.println();
    }
    public void displayPrime(){
        System.out.print("Prime numbers:");
        for (int i = 0; i < num.length; i++){
            if (num[i] == 0 || num[i] == 1){
                continue;
            }
            else {
                boolean prime = true;
                for (int j = 2; j < num[i]; j++){
                    if (num[i] % j == 0){
                        prime = false;
                        break;
                    }
                }
                if (prime){
                    System.out.printf(" %d ",num[i]);
                }
            }
        }
        System.out.println();
    }
    public void displayMax(){
        int max = num[0];
        for (int i = 0; i < num.length; i++){
            if (num[i] > max){
                max = num[i];
            }
        }
        System.out.printf("Maximum number: %d\n",max);
    }
    public void displayMin(){
        int min = num[0];
        for (int i = 0; i < num.length; i++){
            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.printf("Minimum number: %d\n",min);
    }
    public void displayAverage(){
        double sum = 0;
        for (int i = 0; i < num.length; i++){
            sum += num[i];
        }
        double average = sum/num.length;
        System.out.printf("Average: %.2f\n",average);
    }
    public void displaySquareNum(){
        for (int i = 0; i < num.length; i++){
            System.out.printf("Number: %d | Squared: %d\n",num[i],num[i]*num[i]);
        }
    }
}
