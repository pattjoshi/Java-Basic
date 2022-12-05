public class MargeSort {

    // Print array
    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // MargeSort recurshion
    public static void margeSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2;
        margeSort(arr, si, mid); // Left Part
        margeSort(arr, mid + 1, ei); // Right part
        marge(arr, si, mid, ei);
    }

    // Marge (+)
    public static void marge(int arr[], int si, int mid, int ei) {
        // left(0,3)=4 right (4,6)=3 --> 6-0+1
        int temp[] = new int[ei - si + 1];
        int i = si; // Iterator for left side
        int j = mid + 1; // Iterator for Right side
        int k = 0; // Iterator for temp arr

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

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // Copy temp to orinal orray
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
