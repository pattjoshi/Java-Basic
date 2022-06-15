
// Check whether a number is even or odd using if...else statement
package Intruduction;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:-");
        int Input = sc.nextInt(); // 12
        if (Input % 2 == 0) { // 12 % 2== 0

            System.out.println(Input + " Even "); // 12 Even

        } else {
            System.out.println(Input + " Odd ");
        }
        sc.close();
    }
}

// Check whether a number is even or odd using ternary operator
// package Intruduction;

// import java.util.Scanner;

// public class EvenOdd {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a Number:");
// int Input = sc.nextInt();
// String evenOdd = (Input % 2 == 0) ? "Even" : "Odd";
// System.out.println(Input + " is a " + evenOdd);

// sc.close();
// }

// }

// % = remainder
