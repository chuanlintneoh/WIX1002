import java.util.Scanner;
import java.lang.Math;
public class inCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius of circle(units): ");
        double radius = sc.nextDouble();
        System.out.println("Given coordinate of point(x,y).");
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();

        double distance_Centre = Math.sqrt(x*x + y*y);
        String position;
        if (distance_Centre > radius){
            position = "outside of";
        }
        else if (distance_Centre == radius){
            position = "on the border of";
        }
        else {
            position = "inside of";
        }
        System.out.printf("Point(%.2f,%.2f) is %s the circle with centre(0,0).",x,y,position);
    }
}
