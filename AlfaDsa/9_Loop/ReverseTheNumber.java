
public class ReverseTheNumber {
    public static void main(String[] args) {
        int num = 15099;
        int reverse = 0;
        while (num > 0) {
            // Reverse the num get a nue number
            int LD = num % 10;
            reverse = (reverse * 10) + LD;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
