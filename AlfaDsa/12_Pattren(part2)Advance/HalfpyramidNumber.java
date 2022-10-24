public class HalfpyramidNumber {
    public static void Half_pyramid_number(int n) {
        // outer-loop
        for (int i = 1; i <= n; i++) {
            // Inner-loop (col)
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();// New line
        }
    }

    public static void main(String[] args) {
        Half_pyramid_number(5);

    }
}
