import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        simpleCalculator obj = new simpleCalculator();
        String[] num = new String[2];
        int num1, num2;
        System.out.print("Enter two integer number: ");
        num = sc.readLine().split(" ");
        num1 = Integer.parseInt(num[0]);
        num2 = Integer.parseInt(num[1]);
        double num1d = new Double(num1);
        double num2d = new Double(num2);
        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);
        double ans = obj.calc(num1d, num2d, operand);

        if (operand == '+'|operand == '-'|operand == '*'|operand == '/'|operand == '%'){
            System.out.printf("%d %c %d  = %.2f",num1,operand,num2,ans);
        }
        else {
            System.out.println("Invalid operand! Please try again.");
        }
    }
    double calc(double a, double b, char c){
        if (c == '+'){
            return a + b;
        }
        else if (c == '-'){
            return a - b;
        }
        else if (c == '*'){
            return a * b;
        }
        else if (c == '/'){
            return a / b;
        }
        else {
            return a % b;
        }
    }
}
