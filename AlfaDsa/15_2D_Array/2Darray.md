# 2D Array

# Intuduction to 2D Array

<img width="704" alt="image" src="https://user-images.githubusercontent.com/78966839/199962844-1687d57d-7821-403a-a38e-e3f10e9f275d.png">

<img width="707" alt="image" src="https://user-images.githubusercontent.com/78966839/199963552-8de1fe8c-81d6-4800-8270-deb1e629d58f.png">

# Real life example 

<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/199964691-564544fe-d436-4aae-807d-b44c60abfbaa.png">

# Representation of 2D array
- **2D array input 1st row then col**
<img width="718" alt="image" src="https://user-images.githubusercontent.com/78966839/199967114-ed06de2e-bf18-454c-bc60-dca08d7a24ce.png">

## 2D array creation  Search element Largest and Smallest element in array

```
import java.util.Scanner;

public class Create2Darr {
    // Search an element
    public static boolean Search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;
    }

    // Largest and Small
    public static int LrgSml(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
                if (smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest num is " + largest);
        System.out.println("Smallest num is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
        Search(matrix, 7);
        LrgSml(matrix);
    }
}
```
---

# [Java: A two dimensional array is stored in column-major or row-major order?](https://stackoverflow.com/questions/6630990/java-a-two-dimensional-array-is-stored-in-column-major-or-row-major-order)

- **Consequently, Java is neither column-major nor row-major order**

## Row-major
<img width="533" alt="image" src="https://user-images.githubusercontent.com/78966839/199993878-220c4a7a-3dad-422c-a043-9dc53f53bc13.png">


# Colum-major
<img width="585" alt="image" src="https://user-images.githubusercontent.com/78966839/199996990-71ed56a4-0db0-49a9-b32e-f93331c57174.png">


# 2D Arrays in Memory

<img width="413" alt="image" src="https://user-images.githubusercontent.com/78966839/199997563-91535e1b-da6c-48cd-a1be-6c131c8ae249.png">

<img width="460" alt="image" src="https://user-images.githubusercontent.com/78966839/199997688-098ce520-8e8a-4fd2-88d7-f02309c9e245.png">

---

# [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/description/)

<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/200026674-5fef12bb-75b4-467d-9a9a-82259b1c0856.png">

- 1st cover outer Boundary then inner till 0 element.
<img width="710" alt="image" src="https://user-images.githubusercontent.com/78966839/200027157-81761767-669a-4ec9-a5c7-ee09eb134d8e.png">

- 1 Loop 2 col
- 1 loop 2 row
<img width="715" alt="image" src="https://user-images.githubusercontent.com/78966839/200028252-528bee77-17a3-4df4-b23f-8209b9690005.png">

<img width="716" alt="image" src="https://user-images.githubusercontent.com/78966839/200030369-450118c2-8cdb-431b-9a81-a00954923b49.png">

<img width="421" alt="image" src="https://user-images.githubusercontent.com/78966839/200030940-54ab2be8-73c8-43bd-89ac-ad60957129dd.png">

## Approch
<img width="703" alt="image" src="https://user-images.githubusercontent.com/78966839/200038810-0311e37b-faef-49d0-a2d1-2bb7adba2f71.png">

## size= nxn odd number matrix mxn 

<img width="796" alt="image" src="https://user-images.githubusercontent.com/78966839/200051851-b58ebd6b-d14d-4d89-80ef-fd41664d085f.png">

---

```
public class SprialMatrix {

    // Spiral Matrix
    public static void Spiral_matrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) { // j= col
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // botton
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) { // odd number
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) { // // odd number
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        Spiral_matrix(matrix); // 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
    }
}
```

---

# [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)

- left-Top -- Buttom-Right => Primary Diagonal
- Right-Top -- Butom-Left => Secondary Digonal

<img width="853" alt="image" src="https://user-images.githubusercontent.com/78966839/200134369-d4d34e58-c896-47ce-96c1-7b9ca0056d30.png">

### Approch

- **i == j**
<img width="619" alt="image" src="https://user-images.githubusercontent.com/78966839/200134446-cf0c5474-ee8a-4211-b214-c3e99a0cf6cd.png">

- **i + j = n-1**

<img width="569" alt="image" src="https://user-images.githubusercontent.com/78966839/200134484-de29996c-5fa3-44f5-8149-87edce3afe06.png">


#### Optimize approch
<img width="399" alt="image" src="https://user-images.githubusercontent.com/78966839/200134519-6ee25dde-8a1a-45c4-a9a4-1b5a6b3b0ea1.png">


## Tc :- 0(n)

```
public class DigonalSum {

    public static int digonal_sum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // SD
              if (i != matrix.length - i - 1)
            sum += matrix[i][matrix[0].length - i - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(digonal_sum(matrix));
    }
}

// Primary Digonal = i = j
// SecondaryDigonal = i + j = n-1
```

---





































