public class Sum2row {
    // Print out the sum of the numbers inthe second row of the “nums” array
    public static void Sum2ndRow(int num[][]) {
        int sum = 0;
        for (int j = 0; j < num[0].length; j++) {
            sum += num[1][j];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        Sum2ndRow(nums);
    }
}
