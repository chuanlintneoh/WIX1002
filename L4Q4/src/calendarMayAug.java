import java.util.Scanner;
public class calendarMayAug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if (year < 1){
            System.out.println("Invalid input! Please try again.");
        }
        else {
            System.out.println("Given Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday(6), Sunday(7)");
            System.out.print("Enter first day of the year: ");
            int day = sc.nextInt();
            int normal_Jan_May = 31 + 28 + 31 + 30;
            int leap_Jan_May = 31 + 29 + 31 + 30;
            int normal_Jan_Aug = 31 + 28 + 31 + 30 + 31 + 30 + 31;
            int leap_Jan_Aug = 31 + 29 + 31 + 30 + 31 + 30 + 31;
            int daysMay = 31;
            int daysAug = 31;
            int Jan_May;
            int Jan_Aug;
            if (day < 1 || day >7) {
                System.out.println("Invalid input! Please try again.");
            }
            else {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    Jan_May = leap_Jan_May;
                    Jan_Aug = leap_Jan_Aug;
                }
                else {
                    Jan_May = normal_Jan_May;
                    Jan_Aug = normal_Jan_Aug;
                }
                calendarMayAug.MayCalendar(day, Jan_May, year, daysMay);
                System.out.println();
                calendarMayAug.AugCalendar(day, Jan_Aug, year, daysAug);
            }
        }
    }

    public static void MayCalendar(int a, int b, int c, int d) {
        System.out.printf("\n\t\tMay %d\n", c);
        String[] monthDay = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int firstMay = b % 7 + a;
        if (firstMay != 7) {
            firstMay = firstMay % 7;
        }
        for (int i = 0; i < monthDay.length; i++) {
            System.out.printf("%s\t", monthDay[i]);
        }
        System.out.println();
        for (int date = 2 - firstMay; date <= d; date++) {
            if (date < 1) {
                System.out.print("   \t");
            }
            else {
                if (date < 10) {
                    System.out.printf(" %d \t", date);
                }
                else {
                    System.out.printf(" %d\t", date);
                }
            }
            if ((date + firstMay - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
    public static void AugCalendar(int a, int b, int c, int d) {
        System.out.printf("\n\t\tAug %d\n", c);
        String[] monthDay = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int firstAug = b % 7 + a;
        if (firstAug != 7) {
            firstAug = firstAug % 7;
        }
        for (int i = 0; i < monthDay.length; i++) {
            System.out.printf("%s\t", monthDay[i]);
        }
        System.out.println();
        for (int date = 2 - firstAug; date <= d; date++) {
            if (date < 1) {
                System.out.print("   \t");
            }
            else {
                if (date < 10) {
                    System.out.printf(" %d \t", date);
                }
                else {
                    System.out.printf(" %d\t", date);
                }
            }
            if ((date + firstAug - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}