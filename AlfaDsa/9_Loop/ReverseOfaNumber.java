public class ReverseOfaNumber {
    public static void main(String[] args) {
        // Reverse of a Number
        int num = 13485;
        while (num > 0) {
            int last = num % 10;
            System.out.print(last);
            num /= 10;
        }
    }
}
