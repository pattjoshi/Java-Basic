public class compress {

    public static String Compress(String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer conunt = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                conunt++;
                i++;
            }

            sb.append(str.charAt(i));

            if (conunt > 1) {
                sb.append(conunt.toString());
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "aaabbccdda";
        System.out.println(Compress(str)); // a3b2c2d2a
    }
}
