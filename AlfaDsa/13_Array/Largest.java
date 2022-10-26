
public class Largest {
    public static int get_largest(int number[]) {
        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE; // + infinity
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is " + smallest); // Smallest
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 12, 54, 69, 22, 88, 55, 44, 14, 10 };
        System.out.println("largest value is: " + get_largest(number));
    }
}
