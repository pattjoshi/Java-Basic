import java.util.Scanner;

// Write a program to find the factorialof any number entered by the user

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("factorial of is" + fact);

        sc.close();

    }

}

// What is Factorial Number
// Factorial of a positive integer (number) is the sum of multiplication of all
// the integers smaller than that positive integer