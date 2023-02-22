package ProgrammingIZ.Intruduction;

import java.util.*;;

public class sum {
    // Java Program to Add Two Integers
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println(sum);
        sc.close();
    }
}
