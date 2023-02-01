import java.util.*;
public class burgerStall {
    private Scanner sc = new Scanner(System.in);
    private String ID;
    private int amount;
    private static int totalAmount;
    public burgerStall(){
        System.out.print("Enter ID: ");
        ID = sc.nextLine();
        amount = 0;
    }
    public void sold(int amount){
        this.amount += amount;
        totalAmount += amount;
    }
    public void display(){
        System.out.printf("Stall ID: %s\n",ID);
        System.out.printf("Total burgers sold: %d\n",amount);
    }
    public static void displayTotal(){
        System.out.printf("Total burgers sold in all stalls: %d\n",totalAmount);
    }
}
