public class Factorial {
    public static int Faco(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f; // Factorial of N
    }

    public static void main(String[] args) {

        System.out.println(Faco(5));

    }
}
