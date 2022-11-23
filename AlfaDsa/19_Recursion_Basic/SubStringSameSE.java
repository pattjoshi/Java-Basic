public class SubStringSameSE {
    // find the name of substring with equal first and last latter
    public static int ContSubString(String str, int i, int j, int n) {
        if (n == 1) { // Single latter substring
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = ContSubString(str, i + 1, j, n - 1) + ContSubString(str, i, j - 1, n - 1)
                - ContSubString(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        System.out.println(ContSubString(str, 0, n - 1, n));

        // i = Starting from statr
        // j = Starting from end

    }
}
