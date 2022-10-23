import java.util.Scanner;

public class AvgOf3num {

    // Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int x = sc.nextInt();
        System.out.println("Enter 2st Number");
        int y = sc.nextInt();
        System.out.println("Enter 3st Number");
        int z = sc.nextInt();
        System.out.println("The average of 3 Number is" + averageOf3Num(x, y, z));

    }

    // Average of 3 functioin
    public static int averageOf3Num(int x, int y, int z) {
        return (x + y + z) / 3;

    }
}

// Stape 1:- Enter 3 num in main function
// Stape 1:- create function averageOf3Num
// Stape 1:- in averageOf3Num function add 3 num and dev by 3 and return
// Stape 1:- Function calll in main method
