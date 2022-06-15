// Java Program to Find ASCII Value of a character
package Intruduction;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any cahracter ");

        char chr = sc.next().charAt(0);
        int ascii = (int) chr;
        System.out.println("ASCII Value of " + chr + " is " + ascii);
        sc.close();

    }
}

// Convert ch to int give ASCII VALUE
