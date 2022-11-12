public class OddEven {

    public static void oddeven(int num) {
        int butMask = 1;
        if ((num & butMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        oddeven(3); // Odd number
        oddeven(4); // Even Number
        oddeven(14); // Even Number
    }
}
