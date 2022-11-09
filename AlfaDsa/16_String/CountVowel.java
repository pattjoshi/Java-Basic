import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        int count = 0;
        // convert string to character
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println(count);

    }
}
