public class Fibonashi {
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n)); // 8

    }
}

// Fibonasi is Sum of last 2 number
// fib(n) = fin(n-1) + fin(n-2)