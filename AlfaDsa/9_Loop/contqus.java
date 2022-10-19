import java.util.Scanner;

public class contqus {
    public static void main(String[] args) {

        do {
            // Display all the number entered By user except multiples of 10
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println("Your Number is " + num);

        } while (true);

    }
}
