public class Decrement {
    public static void main(String[] args) {
        // int a = 9;
        // int b = --a;
        // /*
        // * Pre-Decrement --a
        // * 1. value change
        // * 2. value use
        // */
        // System.out.println(a); // 8
        // System.out.println(b); // 8

        // Post-dec a--
        // 1.value use
        // 2. value change
        int a = 10;
        int b = a--;
        System.out.println(a); // 9
        System.out.println(b); // 10
    }
}
