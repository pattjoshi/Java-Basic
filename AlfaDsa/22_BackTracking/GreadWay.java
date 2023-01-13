public class GreadWay {
    public static int greadWay(int i, int j, int n, int m) {
        // Base case
        if (i == n - 1 && j == m - 1) { // Condn for last cell
            return 1;
        } else if (i == n || j == n) { // boundary cross condn
            return 0;
        }

        int w1 = greadWay(i + 1, j, n, m);// Down
        int w2 = greadWay(i, j + 1, n, m);// Right
        return w1 + w2; // Total
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Total gread Way " + greadWay(0, 0, m, n));
    }
}
