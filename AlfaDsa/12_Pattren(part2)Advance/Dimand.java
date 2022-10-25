
public class Dimand {
    public static void dimand_pattren(int n) {
        // 1-half
        for (int i = 1; i <= n; i++) {
            // space (n-1)
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // 2 * (i + 1) Odd Number
            for (int j = n; j <= 2 * (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2=half
        for (int i = n; i >= 1; i--) {// n to 1
            // space (n-1)
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // start Odd Number 2*(i+1)
            for (int j = n; j <= 2 * (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dimand_pattren(4);

    }
}
