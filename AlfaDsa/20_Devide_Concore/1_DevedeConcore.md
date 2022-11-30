## Devide and concore

<img width="734" alt="image" src="https://user-images.githubusercontent.com/78966839/204021424-171d9815-3558-4bad-a9cf-39053d4bbdd3.png">

- **A divide and conquer algorithm is a strategy of solving a large problem by breaking the problem into smaller sub-problems solving the sub-problems, and
combining them to get the desired output**

# Marge Sort : (n log n)
- Sorting : = A element arrange to a purticular order
- Accending
- Decending

## Approch
## STAP 1
- **Divide ( mid )**
<img width="724" alt="image" src="https://user-images.githubusercontent.com/78966839/204035122-6c347ce0-e271-4306-9c86-834c75b20ee3.png">

## How to find middle index SI & EI
<img width="191" alt="image" src="https://user-images.githubusercontent.com/78966839/204097340-5ff11223-0b79-4b63-9c6c-ad378c077f97.png">

- we use 2 Way **SI + (EI - SI)/2**

## STAP 2 
- **Margesort (left)**
- **margeSort(Right)**

<img width="512" alt="image" src="https://user-images.githubusercontent.com/78966839/204098300-b1eaa23c-6d4e-473b-81b3-74af38b5bd3b.png">

## STAP 3 Mwrge
- Now the left & RightPart is sorted add soluion of left and right create my Big solution.
- Create a tempare array
- Size = Left + Right els
- Take 3 Itrater
- 1st Iterater for Left morge 
- 2nd Iterater for Riht morge
- 3rd Iterater for Tempare Array
- Becouse these are sorted Smaller element comp in Begine

<img width="714" alt="image" src="https://user-images.githubusercontent.com/78966839/204098834-1c34d626-ce70-4522-b2d7-a30ee19bd421.png">

- Compair left SI  and right SI which is smaller place temp array of 0th position.

- **Accending order sorted array**
<img width="522" alt="image" src="https://user-images.githubusercontent.com/78966839/204099494-feac635d-e486-4603-b23d-6b43c58470f9.png">

## Summery
- Sorted array of orginal un sorted array
<img width="731" alt="image" src="https://user-images.githubusercontent.com/78966839/204100164-2a4d1501-a911-4b73-8f83-89888e9ffd8c.png">

## Approch
<img width="239" alt="image" src="https://user-images.githubusercontent.com/78966839/204100255-96a38836-2459-42e7-b457-920608e9e3e4.png">


## Code

```
public class MargeSort {

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

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
        PrintArray(arr); // 2 3 5 6 8 9 
    }
}
```

<img width="718" alt="image" src="https://user-images.githubusercontent.com/78966839/204131716-7df0fd73-8df4-4f81-a2df-4586d69236d9.png">

---

# Quick Sort
- **Not use extra Space**
<img width="472" alt="image" src="https://user-images.githubusercontent.com/78966839/204132369-b0395292-4e72-49fc-b91f-1dcc3e38e159.png">

## What is the quick sort?

#### Quicksort is a divide-and-conquer algorithm. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. For this reason, it is sometimes called partition-exchange sort.

- It work on Pivot & partitition Apporch

## pivot
- **which is a somewhat arbitrary element in the collection.**

<img width="306" alt="image" src="https://user-images.githubusercontent.com/78966839/204132359-eeccc36c-0e21-46ad-a3c0-fffec1157d31.png">

- **Mostly we use last eleent to pivot**

<img width="329" alt="image" src="https://user-images.githubusercontent.com/78966839/204132806-236466b3-c7bc-4ee2-a486-1266b6decc79.png">

<img width="731" alt="image" src="https://user-images.githubusercontent.com/78966839/204144240-95b7873d-89ea-4ea3-a6bf-58d98b0d8886.png">

```
import java.nio.channels.Pipe;

public class QuickSort {

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        // find pivot (Last element)
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left
        quickSort(arr, pIdx + 1, ei); // right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for els smaller then pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        PrintArr(arr);
    }
}
```

# Worst case in quick sort
<img width="728" alt="image" src="https://user-images.githubusercontent.com/78966839/204318414-7a9abbbb-1531-4924-a9d5-ee5fc1ecf0fd.png">


# Search in Rotated sorted array

<img width="716" alt="image" src="https://user-images.githubusercontent.com/78966839/204557464-e4e87c40-1300-453d-a0e8-01f3b4c50efd.png">

## Approch
<img width="640" alt="image" src="https://user-images.githubusercontent.com/78966839/204558575-d0460805-8a21-48be-b168-78520bab4f47.png">

<img width="767" alt="image" src="https://user-images.githubusercontent.com/78966839/204560930-4efa37e5-bf02-4114-bdb5-f2755f7fdd3e.png">

### Case 1
<img width="727" alt="image" src="https://user-images.githubusercontent.com/78966839/204561746-82668770-3056-4e4b-b8f0-54f2a90bae5c.png">
### Case 2

<img width="782" alt="image" src="https://user-images.githubusercontent.com/78966839/204564475-b88c8aa5-0474-496f-bea6-e38389fb3eb0.png">

<img width="750" alt="image" src="https://user-images.githubusercontent.com/78966839/204564962-eb6bd7db-fea7-465a-971a-f2c6d8ecef92.png">

```
public class SearchRotated {

    public static int Search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        // case FOUND
        if (arr[mid] == target) {
            return mid;
        }
        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a : Left
            if (arr[si] <= target && target <= arr[mid]) {
                return Search(arr, target, si, mid - 1);
            } else {
                // case b: right
                return Search(arr, target, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            // case c : right
            if (arr[mid] <= target && target <= arr[ei]) {
                return Search(arr, target, mid + 1, ei);
            } else {
                // case D : left
                return Search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 8, 9 };
        int tarIdx = Search(arr, 8, 0, arr.length - 1);
        System.out.println(tarIdx);

    }
}
```


# Qus
<img width="359" alt="image" src="https://user-images.githubusercontent.com/78966839/204787566-0b6372e4-0551-479b-970b-4afcd6dfabb6.png">

<img width="380" alt="image" src="https://user-images.githubusercontent.com/78966839/204786994-181d9597-d574-477d-a263-18d6c29a0d61.png">


# Solution 
<img width="359" alt="image" src="https://user-images.githubusercontent.com/78966839/204787122-2a804c5e-e91c-44f5-af49-8b5a6be02748.png">
<img width="347" alt="image" src="https://user-images.githubusercontent.com/78966839/204787662-d7446339-e354-4b00-86e7-76e3febc90eb.png">
<img width="349" alt="image" src="https://user-images.githubusercontent.com/78966839/204787723-058c76f1-b1b0-4461-8160-d2397c5630c9.png">
<img width="350" alt="image" src="https://user-images.githubusercontent.com/78966839/204787779-75ae3dd5-323b-415f-928b-df0b15ca1182.png">
<img width="337" alt="image" src="https://user-images.githubusercontent.com/78966839/204787823-b19d6ca9-f98f-4d81-ac6c-652be4ec8e7d.png">
<img width="347" alt="image" src="https://user-images.githubusercontent.com/78966839/204787862-7cee068f-57f3-48dc-a914-6cc47d7ac18a.png">

<img width="355" alt="image" src="https://user-images.githubusercontent.com/78966839/204787992-98db1257-20fb-4cb5-96be-33d1f32542d0.png">
<img width="351" alt="image" src="https://user-images.githubusercontent.com/78966839/204788049-0523e5c0-d39a-44bc-ab64-ecc56f41845f.png">


<img width="351" alt="image" src="https://user-images.githubusercontent.com/78966839/204788752-559ae550-cf4e-4f79-8404-b6c7d0e71a45.png">



