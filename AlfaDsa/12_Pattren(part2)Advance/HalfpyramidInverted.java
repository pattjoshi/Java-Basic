public class HalfpyramidInverted {
    // Print Inverted half Pyramd
    public static void inverted_half_Pyramid(int n) {
        // Outer
        for (int i = 1; i <= n; i++) {// row
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Starts
            for (int j = 1; j <= i; j++) { // 1row 1star ...
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_Pyramid(4);
    }

}
// matrix
// space & star
// logic How meney star and space
// space = n-row
// stars = 1row 1 star...
// new line
