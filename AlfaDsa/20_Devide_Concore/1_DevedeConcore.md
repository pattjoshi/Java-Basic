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





























