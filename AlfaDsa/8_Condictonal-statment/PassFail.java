import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Mark");
        int marks = sc.nextInt();
        String Status = (marks > 33) ? "Pass" : "Fail";
        System.out.println("Your Report is " + Status);
        sc.close();
    }
}
