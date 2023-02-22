package ProgrammingIZ.Intruduction;

import java.util.*;;

public class userInputInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The number is " + n);
        sc.close();
    }
}
