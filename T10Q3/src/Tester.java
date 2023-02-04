import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        Person[] a = new Person[n];
        String[] name = new String[n];
        for (int i = 0; i < n; i++){
            System.out.printf("Name: ");
            name[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Names:");
        for(int i = 0; i < a.length; i++){
            a[i] = new Person(name[i]);
            System.out.println(name[i]);
            System.out.println(a[i]);
        }
        System.out.println();
        for (int pass = 1; pass < a.length; pass++){
            for (int i = 0; i < a.length - 1; i++){
                if (a[i].compareTo(a[i+1]) > 0){
                    String temp = a[i].getName();
                    a[i].setName(a[i+1].getName());
                    a[i+1].setName(temp);
                }
            }
        }//bubble sorting
        System.out.println("Sorted Names:");
        for (Person person : a) {
            person.display();
        }
    }
}
