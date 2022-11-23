public class BinaryString {
    public static void PrintBinaryString(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // Place all chair in 0
        PrintBinaryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            PrintBinaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        PrintBinaryString(3, 0, "");
    }
}
