// Java Program to Add Two Integers (user Input )

package Intruduction;

import java.util.Scanner;

public class addToNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num :-");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd num:-");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is:" + sum);
        sc.close();

    }

}
