public class Prime {
    public static boolean prinmeNumber(int n) {
        // corner cases
        // 2
        if (n == 2) {
            return true;
        }
        boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // compleatly deviding
                isprime = false;
                break;
            }
        }
        return isprime;

    }

    public static void main(String[] args) {
        System.out.println(prinmeNumber(22));

    }
}
// Over loading
// a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).