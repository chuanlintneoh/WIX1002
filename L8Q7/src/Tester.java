import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Money a = new Money();
        while (true){
            System.out.println("Enter 'a' for addition, 's' for subtraction, 'q' to proceed with round up:");
            char input = sc.next().charAt(0);
            switch (input){
                case 'a':
                    a.addition();
                    break;
                case 's' :
                    a.subtraction();
                    break;
                case 'q' :
                    break;
                default:
                    System.out.println("Invalid input! Please try again.");
            }
            if (input == 'q'){
                break;
            }
        }
        a.roundUp();
        a.display();
    }
}
