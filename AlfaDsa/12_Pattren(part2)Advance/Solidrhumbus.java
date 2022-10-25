public class Solidrhumbus {
    public static void solid_rhomBus(int n) {
        // Outer
        for (int i = 1; i <= n; i++) {
            // space col (n - i)
            for (int j = 1; j <= (n - i); j++) { // Inner
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solid_rhomBus(5);
    }
}
