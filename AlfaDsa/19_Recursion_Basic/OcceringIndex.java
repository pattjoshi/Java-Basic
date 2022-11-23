public class OcceringIndex {
    // Find the all Oxcurence of an array which index
    public static void allOccurences(int arr[], int key, int i) {

        if (i == arr.length) { // Base case
            return;
        }
        if (arr[i] == key) { // kaam
            System.out.print(i + " ");
        }
        allOccurences(arr, key, i + 1); // Function Call
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 7, 3, 3, 2, 6, 3, 2, 7, 2, 4, 2 };
        int key = 2;
        allOccurences(arr, key, 0);

    }
}
