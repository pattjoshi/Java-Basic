public class SubArray {
    public static void sub_array(int number[]) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) { // start
            int start = i;
            for (int j = i; j < number.length; j++) { // end (single element)
                int end = j;
                for (int k = start; k <= end; k++) { // print
                    System.out.print(number[k] + " "); // subarray

                }
                System.out.println();

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        sub_array(number);

    }
}
