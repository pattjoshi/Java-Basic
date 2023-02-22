package ProgrammingIZ.Intruduction;

// Java Program to Swap Two Numbers
// In this program, you'll learn two techniques to swap two numbers in Java. The first one uses a temporary variable for swapping, while the second one doesn't use any temporary variables.

public class swap {
    public static void main(String args[]) {
        int a = 7;
        int b = 8;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A is " + a);
        System.out.println("B is " + b);

    }
}
