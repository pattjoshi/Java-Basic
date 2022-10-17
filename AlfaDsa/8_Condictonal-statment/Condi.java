
public class Condi {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Adult");
        }
        if (age >= 0 && age <= 17) {
            System.out.println("You are Teen"); // && Both true then true

        } else {
            System.out.println("Not adult");
        }

    }
}