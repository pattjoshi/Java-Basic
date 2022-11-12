
public class getIth {
    // Get ith position (0,1)
    public static int getItH(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        System.out.println(getItH(10, 2));// 0

    }

}
