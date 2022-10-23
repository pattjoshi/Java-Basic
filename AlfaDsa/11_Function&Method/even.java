import java.util.Scanner;

public class even {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a Number");
        num = sc.nextInt();
        if (isEven(num)) { // Function call
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        sc.close();

    }
}
