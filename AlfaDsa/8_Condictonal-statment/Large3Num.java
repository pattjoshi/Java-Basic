import java.util.Scanner;

public class Large3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Number");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A > B && A > C) {
            System.out.println("A is Grater " + A);
        } else if (B > C) {
            System.out.println("B is Grater " + B);
        } else {
            System.out.println("C is Grater " + C);
        }

        sc.close();

    }
}
