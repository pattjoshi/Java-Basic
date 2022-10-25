public class Numberpyramid {
    public static void number_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Space (n-i)
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // star i
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number_pyramid(5);

    }
}
