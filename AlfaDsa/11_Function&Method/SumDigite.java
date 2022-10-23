import java.util.Scanner;

public class SumDigite {
    public static int sumofDegit(int n) {
        int sum = 0;
        while (n > 0) {
            int reminder = n % 10;
            sum = sum + reminder;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter intiger");
        int degit = sc.nextInt();
        System.out.println("The sum is " + sumofDegit(degit));
        sc.close();
    }
}
