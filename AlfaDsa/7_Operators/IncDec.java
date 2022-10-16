
public class IncDec {
    public static void main(String[] args) {
        // 1. value change
        // 2. value use

        // int a = 10; // 11
        // int b = ++a; // 11
        // System.out.println(a);
        // System.out.println(b);

        /*
         * Post Increment a++
         * 1.use value
         * 2. value cahnge
         */
        int a = 10;
        int b = a++;
        System.out.println(a); // 11
        System.out.println(b); // 10

    }

}
