public class LastOccrance {
    public static int Lastocc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1; // not exist
        }
        int isLast = Lastocc(arr, key, i + 1); // Look forword
        if (arr[i] == key && isLast == -1) { // check with self
            return i;
        }
        return isLast;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 7, 6, 5, 3, 6, 5 };
        System.out.println(Lastocc(arr, 1, 0));
    }
}
