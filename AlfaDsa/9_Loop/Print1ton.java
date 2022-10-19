import java.util.Scanner;

public class Print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int range = sc.nextInt();
        int count = 1;
        while (count <= range) {
            System.out.println(count);
            count++;
        }
        sc.close();
    }
}
// Print 1 to n
