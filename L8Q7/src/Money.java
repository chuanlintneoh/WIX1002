import java.util.*;
public class Money {
    private Scanner sc = new Scanner(System.in);
    private double amountRM;
    private int amountCent;
    private int $100;
    private int $50;
    private int $10;
    private int $5;
    private int $1;
    private int cent50;
    private int cent20;
    private int cent10;
    private int cent5;
    public Money(){
        System.out.print("Amount of money (RM): ");
        amountRM = sc.nextDouble();
    }
    public void addition(){
        System.out.print("Add Money (RM): ");
        amountRM += sc.nextDouble();
        System.out.printf("Amount of money (RM): %.2f\n",amountRM);
    }
    public void subtraction(){
        while (true){
            System.out.print("Subtract Money (RM): ");
            double subtract = sc.nextDouble();
            if (subtract > amountRM){
                System.out.println("Insufficient amount! Please try again.");
            }
            else {
                amountRM -= subtract;
                System.out.printf("Amount of money (RM): %.2f\n",amountRM);
                break;
            }
        }
    }
    public void roundUp(){
        amountCent = (int)(amountRM * 100);//convert to cents
        if (amountCent % 10 == 1||amountCent % 10 == 2){
            amountCent = amountCent - amountCent%10;
        }
        else if (amountCent % 10 == 3||amountCent % 10 == 4||amountCent % 10 == 6||amountCent % 10 == 7){
            amountCent = amountCent - amountCent%10 + 5;
        }
        else if (amountCent % 10 == 8||amountCent % 10 == 9){
            amountCent = amountCent - amountCent%10 + 10;
        }//round up base on table
        System.out.printf("Rounded Money Amount: RM %.2f\n",(double)amountCent/100);
        notes_cents();
    }
    private void notes_cents(){
        $100 = (amountCent - amountCent%10000) / 10000;
        amountCent -= $100*10000;
        $50 = (amountCent - amountCent%5000) / 5000;
        amountCent -= $50*5000;
        $10 = (amountCent - amountCent%1000) / 1000;
        amountCent -= $10*1000;
        $5 = (amountCent - amountCent%500) / 500;
        amountCent -= $5*500;
        $1 = (amountCent - amountCent%100) / 100;
        amountCent -= $1*100;
        cent50 = (amountCent - amountCent%50) / 50;
        amountCent -= cent50*50;
        cent20 = (amountCent - amountCent%20) / 20;
        amountCent -= cent20*20;
        cent10 = (amountCent - amountCent%10) / 10;
        amountCent -= cent10*10;
        cent5 = (amountCent - amountCent%5) / 5;
        amountCent -= cent5*5;
    }
    public void display(){
        System.out.println("Number of notes and coins");
        System.out.println("| RM100 | RM50 | RM10 | RM5 | RM1 |");
        System.out.printf("| %5d | %4d | %4d | %3d | %3d |\n",$100,$50,$10,$5,$1);
        System.out.println("| 50cent | 20cent | 10cent | 5cent |");
        System.out.printf("| %6d | %6d | %6d | %5d |\n",cent50,cent20,cent10,cent5);
    }
}
