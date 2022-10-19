import java.util.Scanner;

public class BrQus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a Number");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println("Your Number is " + num);
        } while (true);
        sc.close();
    }
}
