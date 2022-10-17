import java.util.Scanner;

/*
 * Leap Year
 * 1. year % 4 = 0
 * 2. year % 100 != 0
 * 3. year % 100 == 0 && year % 400 == 0
 */

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = sc.nextInt();
        boolean x = year % 4 == 0;
        boolean y = year % 100 != 0;
        boolean z = year % 100 == 0 && year % 400 == 0;
        if (x && (y || z)) {
            System.out.println(year + "Leap Year");
        } else {
            System.out.println(year + "Not a  Leap Year");
        }
        sc.close();

    }
}
