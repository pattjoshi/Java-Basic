//  Check whether an alphabet is vowel or consonant using if..else statement
package Intruduction;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is vowel");
        } else {
            System.out.println(ch + " is Consonant");
        }
        sc.close();
        // why it is slow? because it is not optimized
        // You can use switch case statement instead of if else statement.
    }
}
