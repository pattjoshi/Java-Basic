import java.util.Arrays;
import java.util.Collections;

// DESCENDING
public class ProblemSorting {
    public static void Bubble_sort(int intArray[]) {
        // to array_length - 1 position and compare the element with the next one. *
        // Element is swapped with the next element if the next element is smaller
        int n = intArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (intArray[j - 1] < intArray[j]) {
                    // swap the elements!
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }

            }
        }
    }

    // Selection Sort
    // Pick the smallest(from unsorted),put it at the beginning.
    public static void Selection_sort(int arr[]) {
        // DESCENDING
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }

    // Insertion Sort
    // Pick an element (from unsorted part)&Place in the right pos in serted part
    public static void Insertion_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int pev = i - 1;
            // finding position to insert
            while (pev >= 0 && arr[pev] < curr) {
                arr[pev + 1] = arr[pev];
                pev--;
            }
            // Insert
            arr[pev + 1] = curr;
        }
    }

    // Print array
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        Insertion_sort(arr);
        // Arrays.sort(arr, Collections.reverseOrder()); // it work only Object
        PrintArr(arr); // 8 7 6 5 4 3 3 2 1 1
    }
}

// QUS

// Use the following sorting algorithms to sort an array in DESCENDING order :
// a. Bubble Sort
// b. Selection Sort
// c. Insertion Sort
// d. Counting Sort
// You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]

// Insertion Sort
// START
// Step 1 : If it is the first element, it is already sorted. return 1;
// Step 2 : Pick next element
// Step 3 : Compare with all elements in the sorted sub-list
// Step 4 : Shift all the elements in the sorted sub-list that is less than the
// value to be sorted
// Step 5 : Insert the value
// Step 6 : Repeat until list is sorted
// STOP