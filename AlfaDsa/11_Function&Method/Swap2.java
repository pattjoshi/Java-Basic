
public class Swap2 {
    public static int swapOf2Number(int a, int b) {
        // Swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping A is " + a);
        System.out.println("After swaping B is " + b);
        return a;
    }

    public static void main(String[] args) {
        // Swap - the value
        swapOf2Number(15, 4); // a and b are creating a copy

    }
}
// in java allwayse calls by value
