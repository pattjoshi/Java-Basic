public class BinaryToDec {
    public static void binTodec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            // Last deg
            int LD = binNum % 10;
            decNum = decNum + (LD * (int) Math.pow(2, pow));
            pow++;
            // small to degite
            binNum /= 10;
        }
        System.out.println("decimal of " + myNum + " " + decNum);
    }

    public static void main(String[] args) {
        binTodec(101);
    }
}
