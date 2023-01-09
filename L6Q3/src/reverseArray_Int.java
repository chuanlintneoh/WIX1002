import java.util.Scanner;
public class reverseArray_Int {
    public static void main(String[] args) {
        reverseNum();
    }
    public static void reverseNum(){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Enter integers:");
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        System.out.println("Reversed Numbers:");
        int reversedNum = 0;
        for (int i = 0; i < num.length; i++){
            reversedNum = reversedNum*10 + num[i]%10;
            num[i] = num[i]/10;
            while (num[i] != 0){
                reversedNum = reversedNum*10 + num[i]%10;
                num[i] = num[i]/10;
            }
            System.out.printf("%d\n",reversedNum);
            reversedNum = 0;
        }
    }
}
