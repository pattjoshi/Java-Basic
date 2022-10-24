# Hear i solve the advance patten problem

- matrix
<img width="866" alt="image" src="https://user-images.githubusercontent.com/78966839/197444403-8cea5e45-2617-4d67-9515-ef6c3db74fac.png">

<img width="859" alt="image" src="https://user-images.githubusercontent.com/78966839/197444705-e6b1d24f-407d-49cd-9b77-b48bf06c4737.png">

```
public class hollow_rectangle {
    // Print Holo_rectangle pattren
    public static void Holow_rectangle(int row, int col) {
        // Outer loop
        for (int i = 1; i <= row; i++) {
            // inner - colums
            for (int j = 1; j <= col; j++) {
                // cell = (i,j)
                if (i == 1 || i == row || j == 1 || j == col) {
                    // Boundry condiction
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Holow_rectangle(4, 5);

    }

}
```

# Dry run

<img width="826" alt="image" src="https://user-images.githubusercontent.com/78966839/197450792-a44e2093-b493-4211-a672-589a3b007998.png">

<img width="822" alt="image" src="https://user-images.githubusercontent.com/78966839/197450850-93b82843-c20b-4184-b612-a971e7231ed7.png">

---
# Inverted roted half pryamid

<img width="727" alt="image" src="https://user-images.githubusercontent.com/78966839/197460024-2b70f5ec-2ca8-47a5-8309-ac1a98c21ac2.png">

<img width="715" alt="image" src="https://user-images.githubusercontent.com/78966839/197460456-894a0806-adee-4360-b12f-b0d8e36f6bfb.png">

```
public class HalfpyramidInverted {
    // Print Inverted half Pyramd
    public static void inverted_half_Pyramid(int n) {
        // Outer
        for (int i = 1; i <= n; i++) {// row
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Starts
            for (int j = 1; j <= i; j++) { // 1row 1star ...
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_Pyramid(4);
    }

}
// matrix
// space & star
// logic How meney star and space
// space = n-row
// stars = 1row 1 star...
// new line
```
- **Dry run in copy**

---
# Inverted Half-pyramid with Number
<img width="737" alt="image" src="https://user-images.githubusercontent.com/78966839/197515785-aa22c0f8-009b-4f98-9d10-74e27e32d7f6.png">


```
public class HalfpyramidNumber {
    public static void Half_pyramid_number(int n) {
        // outer-loop
        for (int i = 1; i <= n; i++) {
            // Inner-loop (col)
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();// New line
        }
    }

    public static void main(String[] args) {
        Half_pyramid_number(5);

    }
}
```
- **Dry run in copy**
---
# FLOYD'S TRANGLE 
- counter ++;

<img width="840" alt="image" src="https://user-images.githubusercontent.com/78966839/197522968-87c91964-6455-4bc7-88fa-610ad1156553.png">

```
public class floyd_trang {
    public static void floyds_trangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) { // Outer loop row
            for (int j = 1; j <= i; j++) {// Inner loop -col, How meney time will count be printed
                System.out.print(counter + " ");
                counter++; // every iterate count increase
            }
            System.out.println(); // New line
        }
    }

    public static void main(String[] args) {
        floyds_trangle(5);

    }
}
```
- **Dry run in copy**
---









