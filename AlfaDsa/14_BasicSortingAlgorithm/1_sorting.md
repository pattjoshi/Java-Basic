# Sorting

# What Sorting ?
- **Arrange somthing in an particular order.**
<img width="711" alt="image" src="https://user-images.githubusercontent.com/78966839/199554613-4605bccd-ab8f-4ba7-8b42-70c16da10d86.png">

# Basic Algorithms

<img width="701" alt="image" src="https://user-images.githubusercontent.com/78966839/199554688-cbd97d5d-13dd-4805-bcba-e02bda2f94f9.png">

---

# Bubble sort

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





