public class Reverse {
    // reverse an array
    public static void reverse(int number[]) {
        int start = 0;
        int last = number.length - 1;
        while (start < last) {
            // swap
            int temp = number[last];
            number[last] = number[start];
            number[start] = temp;

            start++; // increase 1 index
            last--; // decrease 2 index

        }
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 4, 6, 12, 23, 45 };
        reverse(number);// function call
        // Prints the number
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

    }
}
