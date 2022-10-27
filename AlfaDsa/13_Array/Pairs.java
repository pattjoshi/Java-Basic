public class Pairs {
    public static void pairs_pattren(int number[]) {
        // Outer layer
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i]; // 2,4,6,8,10
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pair is " + tp);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        pairs_pattren(number);

    }
}
