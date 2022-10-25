public class HoloRhumbus {
    public static void holp_rhumbush(int n) {
        for (int i = 1; i <= n; i++) {
            // space (n-i)
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Star Holo rhumbush logic- star
            for (int j = 1; j <= n; j++) {
                // cell (i,j)
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        holp_rhumbush(5);

    }

}
