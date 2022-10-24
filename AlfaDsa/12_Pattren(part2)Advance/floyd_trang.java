public class floyd_trang {
    public static void floyds_trangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) { // Outer loop row
            for (int j = 1; j <= i; j++) {// Inner loop -col, How meney time will count be printed
                System.out.print(counter + " ");
                counter++; // every iterate count increase
            }
            System.out.println(); // New line
        }
    }

    public static void main(String[] args) {
        floyds_trangle(5);

    }
}
