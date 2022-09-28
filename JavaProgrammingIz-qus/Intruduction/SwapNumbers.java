/* qus:- Swap two numbers without using temporary variable */

package Intruduction;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number ");
        int num1 = sc.nextInt(); // 100
        int num2 = sc.nextInt(); // 200
        num1 = num1 + num2; // num1 = 100+200=300
        num2 = num1 - num2; // num2 = 300 -200= 100
        num1 = num1 - num2; // num1 = 300 -100 =200
        System.out.println("Swap Number is " + num1 + " and " + num2); // 200 and 100
        sc.close();
    }

}

// Java Program to Swap Two Numbers

// package Intruduction;

// import java.util.Scanner;

// public class SwapNumbers {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter tow Number:- ");
// int first = sc.nextInt();
// int sec = sc.nextInt();
// int temp = first;
// first = sec;
// sec = temp;
// System.out.println("The swap Number is " + first + " and " + sec);

// sc.close();
// }
// }

// only use of temporary is to hold the value of first before swapping. You can
// also swap the numbers without using temporary