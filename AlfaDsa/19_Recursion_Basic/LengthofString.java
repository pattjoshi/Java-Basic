public class LengthofString {
    public static int Largestring(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return Largestring(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "abcdefghij";
        System.out.println(Largestring(str)); // 10

    }
}
