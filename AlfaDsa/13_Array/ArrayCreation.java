import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create
        int mark[] = new int[10];
        // input
        System.out.println("Enter Your mark");
        mark[0] = sc.nextInt();// phy
        mark[1] = sc.nextInt();// chm
        mark[2] = sc.nextInt();// math

        // Output
        System.out.println("Phy " + mark[0]);
        System.out.println("chm " + mark[1]);
        System.out.println("math " + mark[2]);

        // Change
        // mark[0] += 1;
        // System.out.println("Updated Phy " + mark[0]);
        // Update
        // mark[2] = 87;
        // System.out.println("Updated Math " + mark[2]);

        // Percentage
        int percentage = (mark[0] + mark[1] + mark[2]) / 3;
        System.out.println("Your Percentage is " + percentage);

        // Length
        System.out.println("length of array is " + mark.length);
        sc.close();

    }
}
