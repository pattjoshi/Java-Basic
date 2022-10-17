import java.util.Scanner;

public class PosNog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        String type = (num >= 0) ? "Positive" : "Negative";
        System.out.println(type);
        sc.close();
    }
}
