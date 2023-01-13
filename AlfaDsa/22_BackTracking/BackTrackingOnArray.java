
public class BackTrackingOnArray {
    public static void changeArr(int arr[], int i, int val) {
        // Base case
        if (i == arr.length) {
            PrintArray(arr);
            return;
        }

        // recurshion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1); // fnx call stape
        arr[i] = arr[i] - 2; // BackTracking
        // Backtracking is allwase after function call
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1); // 1 2 3 4 5
        PrintArray(arr); // -1 0 1 2 3

    }
}
