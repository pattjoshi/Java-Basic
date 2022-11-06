public class Howmeney7 {
    // Print the number of 7’s that are inthe 2d array.

    public static void prsHowMeney7(int arr[][]) {

        int countof7 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    countof7++;
                }
            }
        }
        System.out.println(countof7);

    }

    public static void main(String[] args) {
        int arrar[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };
        prsHowMeney7(arrar);

    }
}
// row = arr.length = 2
// col = arr[0].length = 3
// arr.length - 1 = 1