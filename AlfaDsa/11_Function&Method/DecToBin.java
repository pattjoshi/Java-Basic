public class DecToBin {
    public static void decToBinary(int n) {
        int myNum = n;
        int pow = 0;
        int binary = 0;
        while (n > 0) {
            int rem = n % 2;
            binary = binary + (rem * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }
        System.out.println("Binary of " + myNum + " is = " + binary);
    }

    public static void main(String[] args) {
        decToBinary(5);
    }
}

// function create decToBin
// variable decleare : Pow,binary=0; myNum = n;
// loop
// while (n>0)
// reminder
// binary formula = binary = binary + (rem * (int) Math.pow(10, pow));
// pow ++;
// small the number n /= 2;
// sout