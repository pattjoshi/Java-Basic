public class StringNumber {
    static String Digite[] = { "Zero", "one", "Two", "Three", "Four", "Five", "Six", "Eight", "Nine" };

    public static void PrintDegite(int num) {
        if (num == 0) { // Base case
            return;
        }
        // lase Degith
        int lastDeite = num % 10;
        PrintDegite(num / 10); // Add in last
        System.out.print(Digite[lastDeite] + " ");

    }

    public static void main(String[] args) {
        PrintDegite(231);

    }
}
