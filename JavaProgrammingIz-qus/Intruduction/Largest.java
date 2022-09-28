// Example 1: Find Largest Among three numbers using if..else statement

package Intruduction;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " Is Gratter");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " Is Gratter");
        } else
            System.out.println(num3 + " is Gratter");

        sc.close();
    }
}
