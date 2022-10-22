public class primeOptimize {

    public static boolean isprime(int n) {
        // Corner case 2
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { // corner case
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isprime(7));

    }
}
