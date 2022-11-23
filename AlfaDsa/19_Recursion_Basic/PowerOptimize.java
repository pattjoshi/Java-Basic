public class PowerOptimize {
    // Power of x^n in o(log n)
    public static int OptimizeOpw(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // even
        int halfPow = OptimizeOpw(x, n / 2);
        int halfPowSq = halfPow * halfPow;
        // odd
        if (n % 2 != 0) {
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println(OptimizeOpw(2, 10)); // 1024
    }
}
