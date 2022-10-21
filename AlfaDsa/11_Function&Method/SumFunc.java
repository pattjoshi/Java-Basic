import java.util.Scanner;

public class SumFunc {
    public static int calculateSum(int num1, int num2) { // parameter of formal parameter
        int sum = num1 + num2; // This num 1 and num 2 Only for this class
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // arguments or actual paramente
        System.out.println("Sum of 2 Number is" + sum);

        sc.close();

    }
}

// paramenter :- Function definition
// Arguments :- Funciion call
