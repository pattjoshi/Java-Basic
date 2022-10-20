public class InverseStar {
    public static void main(String[] args) {
        int NL = 4; // Number of line
        for (int line = 1; line <= NL; line++) { // Outer loop
            for (int star = 1; star <= (NL - line + 1); star++) { // Iner loop
                System.out.print("*");
            }
            System.out.println(); // Printing next line
        }
    }
}
/*
 * star <= (NL - line + 1)
 * Line 1 = 4-1 + 1 = 4
 * Line 2 = 4-2 + 1 = 3
 * Line 1 = 4-3 + 1 = 2
 * Line 1 = 4-4 + 1 = 1
 * 
 * OPTPUT WILL BE
 * . ****
 * . ***
 * . **
 * . *
 */