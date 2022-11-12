public class TowPower {
    public static boolean isTwopower(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isTwopower(17)); // false
    }
}
