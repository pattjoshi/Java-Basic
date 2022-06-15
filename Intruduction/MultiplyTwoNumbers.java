// Multiply Two Floating-Point Numbers user INput
package Intruduction;

import java.util.Scanner;

public class MultiplyTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // scanner class for input
        System.out.println("Please Enter the first float number ");
        float num1 = sc.nextFloat();
        System.out.println("Please Enter the second float number ");
        float num2 = sc.nextFloat();
        float result = num1 * num2;// calculate the multiplication
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is:" +
                result);
        // display the output
        sc.close();
        // Scanner close

    }
}
