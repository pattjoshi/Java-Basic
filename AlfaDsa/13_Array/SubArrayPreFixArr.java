public class SubArrayPreFixArr {
    public static void Prifix_subArray(int number[]) {
        int currsum = 0;

        int maxSum = Integer.MIN_VALUE; // -infiniti

        // create prifix array
        int prifix[] = new int[number.length];

        prifix[0] = number[0]; // copy

        // calculate prifix array
        for (int i = 1; i < prifix.length; i++) {

            prifix[i] = prifix[i - 1] + number[i]; // Privious sum + current sum
        }
        for (int i = 0; i < number.length; i++) {

            for (int j = i; j < number.length; j++) {
                currsum = i == 0 ? prifix[j] : prifix[j] - prifix[i - 1];
            }
            if (maxSum <= currsum) {
                maxSum = currsum;
            }

        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        Prifix_subArray(number);
    }
}
