public class StringPalimdrum {

    public static boolean Palim(String s) {
        for (int i = 0; i < s.length(); i++) {
            int n = s.length();
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                // Not a Palmdrom
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(Palim(s));
    }
}
