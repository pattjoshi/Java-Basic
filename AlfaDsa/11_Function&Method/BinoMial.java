public class BinoMial {
    // facotrial
    public static int factorial(int number) {
        int f = 1;
        for (int i = 1; i <= number; i++) {
            f *= i;
        }
        return f;
    }

    // Binomial coff
    public static int BinoCoffe(int n, int r) {
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nMr = factorial(n - r);
        int bincoeff = fac_n / (fac_r * fac_nMr);

        return bincoeff;
    }

    public static void main(String[] args) {
        System.out.println(BinoCoffe(5, 4));
    }
}

// Stape :- Helping function (factorial)
// stape2:- Create Binomial coff function
// factorial of A
// factorial Of B
// factorial of C= factorial(A-B)
// int bino = A /(B *c)
