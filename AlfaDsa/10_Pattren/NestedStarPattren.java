
public class NestedStarPattren {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
            // One line
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            // new line
            System.out.println();
        }
    }
}

/*
 * . *
 * . **
 * . ***
 * . ****
 * . *****
 */
