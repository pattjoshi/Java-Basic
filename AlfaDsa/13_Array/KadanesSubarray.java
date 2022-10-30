public class KadanesSubarray {
    public static void kadanes(int number[]) {
        int cs = 0;
        int ms = 0;
        for (int i = 1; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray is : " + ms);
    }

    public static void main(String[] args) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(number);

    }
}
// Tc o(n)