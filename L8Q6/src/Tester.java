import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Stall A");
        burgerStall a = new burgerStall();
        System.out.println("Stall B");
        burgerStall b = new burgerStall();
        System.out.println("Stall C");
        burgerStall c = new burgerStall();
        System.out.print("Enter burger sold in Stall A: ");
        a.sold(sc.nextInt());
        System.out.print("Enter burger sold in Stall B: ");
        b.sold(sc.nextInt());
        System.out.print("Enter burger sold in Stall C: ");
        c.sold(sc.nextInt());
        a.display();
        b.display();
        c.display();
        burgerStall.displayTotal();
    }
}
