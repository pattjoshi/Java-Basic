public class MaxSubArrayBrotFource {
    // Broute forse apptoch of max subarray
    public static void max_Subarray(int number[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {// print
                    // subarray sum
                    currsum += number[k];
                }
                System.out.print(currsum + ",");
                if (maxSum < currsum) {
                    maxSum = currsum;
                }

            }

        }
        System.out.println("max sum is " + maxSum);

    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        max_Subarray(number);

    }
}
