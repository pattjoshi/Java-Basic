import java.util.Scanner;

public class StringDecleare {
    public static void main(String[] args) {
        char[] ch = { 'a', 'b', 'c' };
        String[] str = { "abc", "xyz" };

        // String are IMMUTABLE in java
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        String Hero = "Tony stack";
        System.out.println(Hero.length());

        // concinication
        String firstName = "Om Prakash";
        String lastName = "Pattjoshi";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName); // Om Prakash Pattjoshi

        // sc.close();
    }
}

// Memory is alocated to str and the value is store "abc", "xyz"
// IMMUTABLE meaning not modify