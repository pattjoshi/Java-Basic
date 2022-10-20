public class HalfPyramid {
    public static void main(String[] args) {
        int NL = 4; // Number Line
        for (int line = 1; line <= NL; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print(star); // Same line
            }
            System.out.println(); // next line
        }

    }

}
/*
 * 1 i =1 1to1
 * 12 i = 2 1to2
 * 123 i=3 1to3
 * 1234 i=4 1to4
 */
