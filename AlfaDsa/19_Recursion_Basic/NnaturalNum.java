public class NnaturalNum {
    // Print the sum of n natural number
    public static int CalcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sn = n + CalcSum(n - 1);
        return sn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalcSum(n));
    }
}
