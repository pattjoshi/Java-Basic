import java.util.Arrays;
import java.util.Collections;

public class inbuildSort {
    // Print array
    public static void PrintArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 1, 4, 3, 2 };
        // Arrays.sort(arr, Collections.reverseOrder()); // 5 4 3 2 1
        Arrays.sort(arr, 0, 3, Collections.reverseOrder()); // 5 4 1 3 2
        PrintArr(arr);
    }
}
