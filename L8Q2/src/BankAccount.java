import java.util.*;
public class BankAccount {
    public Scanner sc = new Scanner(System.in);
    private String name;
    private String ic;
    private double amount;
    public BankAccount(){
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter IC/Passport No.: ");
        ic = sc.nextLine();
        System.out.print("Enter deposit amount: RM ");
        amount = sc.nextDouble();
    }
    public void deposit(){
        System.out.print("Enter deposit amount: RM ");
        double deposit = sc.nextDouble();
        amount += deposit;
        System.out.printf("Amount RM %.2f deposited successfully into %s's account.\n",deposit,name);
    }
    public void withdraws(){
        while (true){
            System.out.print("Enter withdrawal amount: RM ");
            double withdrawal = sc.nextDouble();
            if (withdrawal <= amount){
                amount -= withdrawal;
                System.out.printf("Amount RM %.2f withdrew successfully from %s's account.\n",withdrawal,name);
                break;
            }
            else {
                System.out.println("Insufficient balance! Please try again.");
            }
        }
    }
    public void displayBalance(){
        System.out.println("Account Balance Enquiry");
        System.out.printf("Name: %s\n",name);
        System.out.printf("IC/Passport No.: %s\n",ic);
        System.out.printf("Account balance: RM %.2f\n",amount);
    }
}
