import java.util.Scanner;

public class IncomeTex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        int tex;
        if (Income <= 500000) {
            tex = 0;
        } else if (Income <= 500000 && Income >= 1000000) {
            tex = (int) (Income * (0.2));
        } else {
            // 30 % tex
            tex = (int) (Income * (0.3));
        }
        System.out.println("Your tex is " + tex);
        sc.close();

    }
}
