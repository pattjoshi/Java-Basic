public class Practic {

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // margeSort
    public static void margeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // Kaam
        int mid = si + (ei - si) / 2;
        margeSort(arr, si, mid); // Left
        margeSort(arr, mid + 1, ei); // Rigt
        marge(arr, si, mid, ei);
    }

    public static void marge(int arr[], int si, int mid, int ei) {
        // Temparary array
        int temp[] = new int[ei - si + 1];
        // Iteration decleare
        int i = si; // Left Iteration
        int j = mid + 1; // Rtght Iteration
        int k = 0; // temp Iteration

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Left Part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Right Patr
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // Copy temp to orginal
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        margeSort(arr, 0, arr.length - 1);
        PrintArray(arr);
    }
}
