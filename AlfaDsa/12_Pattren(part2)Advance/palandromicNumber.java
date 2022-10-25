public class palandromicNumber {
    public static void PalanDromic_Number(int n) {
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // decending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // accending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        PalanDromic_Number(5);

    }
}
