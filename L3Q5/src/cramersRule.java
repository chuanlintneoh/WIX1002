import java.util.Scanner;
public class cramersRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,d,e,f;
        double x,y;

        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();
        System.out.print("c: ");
        c = sc.nextDouble();
        System.out.print("d: ");
        d = sc.nextDouble();
        System.out.print("e: ");
        e = sc.nextDouble();
        System.out.print("f: ");
        f = sc.nextDouble();

        if (a*d-b*c == 0){
            System.out.println("\nThe equation has no solution.");
        }
        else {
            x = (e*d - b*f)/(a*d-b*c);
            y = (a*f - e*c)/(a*d-b*c);
            System.out.printf("\nx = %.4f, y = %.4f",x,y);
        }
    }
}
