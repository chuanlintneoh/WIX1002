import java.util.Scanner;
import java.util.Random;
public class descending_LinearBinary_Search {
    public static void main(String[] args) {
        int[] number = new int[20];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < number.length; i++) {
            number[i] = rand.nextInt(101);
            if (i == number.length - 1) {
                System.out.println(number[number.length - 1]);
                break;
            } else {
                System.out.print(number[i] + ", ");
            }
        }

        for (int pass = 0; pass < number.length; pass++) {
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] < number[i + 1]) {
                    int hold = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = hold;
                }
            }
        }//arrange number in descending order

        System.out.println("Array in descending order");
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.println(number[number.length - 1]);
                break;
            } else {
                System.out.print(number[i] + ", ");
            }
        }//print descending order

        int searchNumber, counter = 0;
        boolean status = false;

        System.out.print("Enter a number to search: ");
        searchNumber = sc.nextInt();
        for (int i = 0; number[i] >= searchNumber; i++, counter++) {
            if (number[i] == searchNumber) {
                status = true;
                break;
            }
        }//search input number(linear search)

        if (status) {
            System.out.println(searchNumber + " found");
            System.out.println("Linear Search - " + counter + " loop(s)");
        } else {
            System.out.println("Linear Search - " + searchNumber + " not found");
        }

        counter = 0;
        status = false;
        int start = 0;
        int end = number.length - 1;
        int middle;

        while (start <= end) {
            middle = (start + end) / 2;
            counter++;
            if (searchNumber == number[middle]) {
                status = true;
                break;
            } else if (searchNumber < number[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }//search input number(binary search)

        if (status) {
            System.out.println(searchNumber + " found");
            System.out.println("Binary Search - " + counter + " loop(s)");
        } else {
            System.out.println("Binary Search - " + searchNumber + " not found");
        }
    }
}
