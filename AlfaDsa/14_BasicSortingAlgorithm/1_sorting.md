# Sorting

# What Sorting ?
- **Arrange somthing in an particular order.**
<img width="711" alt="image" src="https://user-images.githubusercontent.com/78966839/199554613-4605bccd-ab8f-4ba7-8b42-70c16da10d86.png">

# Basic Algorithms

<img width="701" alt="image" src="https://user-images.githubusercontent.com/78966839/199554688-cbd97d5d-13dd-4805-bcba-e02bda2f94f9.png">

---

# Bubble sort

- ***to array_length - 1 position and compare the element with the next one. * Element is swapped with the next element if the next element is smaller**

<img width="705" alt="image" src="https://user-images.githubusercontent.com/78966839/199566628-0a07daf8-8bad-4990-b78d-e5e03ff424da.png">

# Bubble sort Idea
- **large elements come to the end of array by swapping with adjacent element**

<img width="749" alt="image" src="https://user-images.githubusercontent.com/78966839/199567113-2031d2f6-d47e-44be-8a14-e247a45bad9e.png">

- 1st > 2nd ----> swap
<img width="823" alt="image" src="https://user-images.githubusercontent.com/78966839/199573177-37d62b3a-74b4-4ea2-ad78-6222a991f821.png">

<img width="789" alt="image" src="https://user-images.githubusercontent.com/78966839/199574770-3639e065-10ac-4cd9-8c4b-fab309115bdc.png">

```
public class bubble {
    // short array
    public static void Bubble_sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) { // currElement > nextElement
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Printing arrray
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Bubble_sort(arr);
        PrintArr(arr);
    }
}
```

## Bog 0 of n-Square (not good)
<img width="698" alt="image" src="https://user-images.githubusercontent.com/78966839/199580260-9a8ded9a-13ce-4a71-8f73-800a11f2cdf7.png">

---
# Selection sort

<img width="714" alt="image" src="https://user-images.githubusercontent.com/78966839/199649545-28636eb5-8468-49e4-8d43-6fb238b033c0.png">

<img width="712" alt="image" src="https://user-images.githubusercontent.com/78966839/199649862-a8c413c6-4fd3-47ac-a89e-5f33d57610ea.png">

<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/199650317-030a730b-35bf-4da6-803a-8c15462e544f.png">

## Selection sort Code
- **TC = Bog o of N-square ,Not good**

```
public class SelectionSort {
    // Selectio sort
    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {// Tern count
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) { // all sorted from i, so it's i+1
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
                // swap
                int temp = arr[minpos];
                arr[minpos] = arr[i];
                arr[i] = temp;
            }
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
```

---

# Insertion sort

- **TC = Bog o of N-square ,Not good**

<img width="709" alt="image" src="https://user-images.githubusercontent.com/78966839/199657684-7c631989-223c-4d68-a597-bad4867b14c7.png">

- **Pick an element (from unsorted part)&Place in the right pos in serted part**

- **TC = Bog o of N-square ,Not good**

<img width="666" alt="image" src="https://user-images.githubusercontent.com/78966839/199659778-13635b3f-0136-4b7f-8d6f-7c2700dd2609.png">


```
public class InsertionSort {

    public static void insertion_Sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the current position
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insertion
            arr[prev + 1] = curr;
        }
    }

    // Printing arrray
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insertion_Sort(arr);
        PrintArr(arr);

    }
}
```
# Inbuilt Sort

- **inthis sortiong accending order**

<img width="776" alt="image" src="https://user-images.githubusercontent.com/78966839/199677421-e3303301-8195-4406-bbd8-3a92711b7580.png">

```
import java.util.Arrays;

public class inbuildSort {
    // Print array
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arr); // 1 2 3 4 5
        Arrays.sort(arr, 0, 3); // 1 4 5 3 2
        PrintArr(arr);
    }
}
```

## sortiong in reverce

<img width="655" alt="image" src="https://user-images.githubusercontent.com/78966839/199677837-8305a580-fe37-4027-a35b-de4c73b3291c.png">

- **reverce order function only work with Object**

```
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
```
# Counting Sort:-
- **Based on keys between a specific range**

<img width="702" alt="image" src="https://user-images.githubusercontent.com/78966839/199768816-88ce5beb-0e13-4569-a6be-8313fc3ce5bc.png">

<img width="710" alt="image" src="https://user-images.githubusercontent.com/78966839/199771098-de5b4d83-6816-4eec-a04f-35388124741a.png">

<img width="661" alt="image" src="https://user-images.githubusercontent.com/78966839/199771810-403818e6-9170-44fa-ab02-8ba38b8ff035.png">

```
public class CountingSort {
    public static void conunting_sort(int arr[]) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void PrinArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        conunting_sort(arr);
        PrinArr(arr); // 1 1 2 3 3 4 4 7

    }
}
```
---

# Sorting Problem
<img width="589" alt="image" src="https://user-images.githubusercontent.com/78966839/199787797-f8440b79-877d-44b3-90b5-b354f9daaeee.png">

# Solution

<img width="354" alt="image" src="https://user-images.githubusercontent.com/78966839/199787964-74ce8035-13f5-4291-9fdc-779af0f80caf.png">

<img width="352" alt="image" src="https://user-images.githubusercontent.com/78966839/199788060-ff09983a-9d2b-4c8c-8d5d-741e80f62939.png">

---
## My solution










