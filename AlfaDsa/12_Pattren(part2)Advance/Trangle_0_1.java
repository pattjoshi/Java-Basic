public class Trangle_0_1 {
    public static void zero_one_trangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {// inner col j
                // cell-no (i+j)
                if ((i + j) % 2 == 0) {// even 1
                    System.out.print("1 ");
                } else {
                    System.out.print("0 "); // odd 0
                }
            }
            System.out.println();// Next line
        }
    }

    public static void main(String[] args) {
        zero_one_trangle(5);

    }
}
// even :1
// odd :0