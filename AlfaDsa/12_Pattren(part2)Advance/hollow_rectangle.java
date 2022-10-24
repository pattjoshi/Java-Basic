
public class hollow_rectangle {
    // Print Holo_rectangle pattren
    public static void Holow_rectangle(int row, int col) {
        // Outer loop
        for (int i = 1; i <= row; i++) {
            // inner - colums
            for (int j = 1; j <= col; j++) {
                // cell = (i,j)
                if (i == 1 || i == row || j == 1 || j == col) {
                    // Boundry condiction
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Holow_rectangle(4, 5);

    }

}
