
public class FindPermutation { // T.c o(n*n!)
    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
        }
        // recurshion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            // "abcde" remove c :- "ab" + "de" = abde
            findPermutation(newString, ans + curr);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutation(str, "");

    }
}
