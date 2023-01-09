import java.util.Scanner;
public class secondConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec = sc.nextInt();
        int hour = 0;
        int min = 0;
        System.out.print(sec + " seconds is ");

        if (sec >= 3600){
            hour = sec/3600;
            sec = sec - hour*3600;
        }
        if (sec >= 60){
            min = sec/60;
            sec = sec - min*60;
        }

        System.out.print(hour + " hour");
        if (hour > 1){
            System.out.print("s");
        }
        System.out.print(", " + min + " minute");
        if (min > 1){
            System.out.print("s");
        }
        System.out.print(" and " + sec +" second");
        if (sec > 1){
            System.out.print("s");
        }
    }
}
