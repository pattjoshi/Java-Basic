
public class Holo {
    public static void main(String[] args) {
        int NL = 4;
        for (int row = 0; row < NL; row++) { // Outer Row
            for (int col = 0; col < NL; col++) { // inner clomn
                if (row == 0 || row == NL - 1 || col == 0 || col == NL - 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

/*
 * . ****
 * . * $ *
 * . * $ *
 * . ****
 * 
 */