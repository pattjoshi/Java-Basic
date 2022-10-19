// Write a program that reads a set of integers, 
// and then pronts the sum of the even and odd integers.

import java.util.Scanner;

public class SumofEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int choise;
        int sumEven = 0;
        int sumOdd = 0;

        do { // Exicute at list once
            System.out.println("Enter a number");
            num = sc.nextInt();
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            System.out.println("1 continue 2 Exict");
            choise = sc.nextInt();
        } while (choise == 1);
        System.out.println("Sum Of Even Number is " + sumEven);
        System.out.println("Sum of Odd Number is " + sumOdd);

        sc.close();
    }
}