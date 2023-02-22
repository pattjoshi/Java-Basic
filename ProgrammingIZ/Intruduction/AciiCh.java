package ProgrammingIZ.Intruduction;

// Java Program to Find ASCII Value of a character
//In this program,you'll learn to find and display the ASCII value of a character in Java.This is done using type-casting and normal variable assignment operations.

import java.util.*;

public class AciiCh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println(ascii);
        sc.close();
    }
}


