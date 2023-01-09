import java.util.Scanner;
public class intFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int integer;
        System.out.print("Enter an Integer: ");
        integer = sc.nextInt();
        int[] factor = new int[integer];

        for (int i = 0; i < factor.length; i++){
            if (integer%(i+1)==0){
                factor[i] = (i+1);
            }
            else {
                factor[i] = 0;
            }
        }
        System.out.print("The factors are: ");
        for (int i = 0; i < factor.length; i++){
            if (factor[i]!= 0){
                System.out.printf("%d",factor[i]);
                if (factor[i] != integer){
                    System.out.print(", ");
                }
            }
        }
    }
}
