public class LargestString {
    public static void main(String[] args) {
        String frote[] = { "zpple", "mango", "banana" };
        String larse = frote[0];
        for (int i = 1; i < frote.length; i++) {
            if (larse.compareTo(frote[i]) < 0) {
                larse = frote[i];
            }
        }

        System.out.println(larse);
    }

}
