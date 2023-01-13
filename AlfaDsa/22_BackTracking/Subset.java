
public class Subset {

    public static void findSubSet(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            }
            System.out.println(ans);
            return;
        }
        // recurshion
        // yes choise
        findSubSet(str, ans + str.charAt(i), i + 1);
        // No choise
        findSubSet(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        findSubSet(str, "", 0);

    }
}
