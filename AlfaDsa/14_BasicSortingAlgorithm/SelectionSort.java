public class SelectionSort {
    // Selectio sort
    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {// Tern count
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) { // all sorted from i, so it's i+1
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;

        }
    }

    // Print
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selection_sort(arr);
        PrintArr(arr);
    }
}
// TC + Bog o of N-square ,Not good