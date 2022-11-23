public class Tiling {
    public static int TilingProblem(int n) { // 2 * n (floor size)
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        return TilingProblem(n - 1) + TilingProblem(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(TilingProblem(4)); // 5

    }
}
