import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bank Account Registration System");
        BankAccount a = new BankAccount();
        System.out.println();
        System.out.println("Transaction System");
        while (true){
            System.out.println("Enter 'd' to deposit, 'w' to withdraw, 'b' for balance enquiry, 'q' to quit");
            char pick = sc.next().charAt(0);
            switch (pick){
                case 'd':
                    a.deposit();
                    break;
                case 'w':
                    a.withdraws();
                    break;
                case 'b':
                    a.displayBalance();
                    break;
                case 'q':
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid input! Please try again.");
            }
        }
    }
}
