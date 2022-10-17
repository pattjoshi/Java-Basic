import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1 :- ");
        int a = sc.nextInt();
        System.out.println("Enter Num 2 :- ");
        int b = sc.nextInt();
        System.out.println("Enter Operater");
        char operater = sc.next().charAt(0);
        switch (operater) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Entry");
                sc.close();
        }
    }
}
