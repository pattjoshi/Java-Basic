public class Setith {

    public static int setitH(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setitH(10, 2));
    }
}
