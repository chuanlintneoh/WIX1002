import java.util.*;
public class WeightCalculator {
    public Scanner sc = new Scanner(System.in);
    private int age;
    private int height;
    public void input(){
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter height (cm): ");
        height = sc.nextInt();
    }
    public void display(){
        System.out.println();
        System.out.println("Please wait while we are calculating your recommended weight...");
        double recommendedWeight = (height - 100 + age/10)*0.9;
        System.out.printf("Age: %d\n",age);
        System.out.printf("Height: %d cm\n",height);
        System.out.printf("Recommended Weight: %.2f kg",recommendedWeight);
    }
}
