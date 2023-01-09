import java.util.Scanner;
public class display_TrianglesDiamonds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("c: ");
        char c = sc.next().charAt(0);
        System.out.println();
        multiPrint(n,c);
        System.out.println();
        triangle(n,c);
        System.out.println();
        diamond(n,c);
    }
    public static void multiPrint(int n,char c){
        for (int i = 0; i < n; i++){
            System.out.print(c);
        }
        System.out.println();
    }
    public static void triangle(int n,char c){
        for(int i=1;i<=n;i++){      // loop to iterate for the given number of rows
            for(int j=n;j>=i;j--){  // loop to print the number of spaces before the c
                System.out.print(" ");
            }
            for (int z=1;z<=i;z++){ // loop to print the number of c in each row
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
    public static void diamond(int n,char c){
        for(int i=1;i<=n;i++){
            for (int j=n;j>=i;j--)
                System.out.print(" ");
            for (int z=1;z<=i;z++)
                System.out.print(c + " ");
            System.out.println();
        }
        for (int i=1; i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(" ");
            }
            for (int z=n;z>i;z--){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
