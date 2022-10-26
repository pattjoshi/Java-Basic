# Introduction

- **Collection of similar DataType**
- placed in a contiguous memory location
- list type structure

<img width="804" alt="image" src="https://user-images.githubusercontent.com/78966839/197843046-b029608f-802b-4ed7-b98d-4092eb7a5ac7.png">

<img width="805" alt="image" src="https://user-images.githubusercontent.com/78966839/197843310-371c1eaa-de9b-4acb-a0cd-61297c00ae1f.png">

<img width="782" alt="image" src="https://user-images.githubusercontent.com/78966839/197843809-b846428d-c53b-4b20-a5d5-9173aab0f359.png">


<img width="820" alt="image" src="https://user-images.githubusercontent.com/78966839/197844441-5fe70e2b-0603-4368-a2c8-09713fb52f3a.png">

- **Hear char size is taken as 1 byte for simplicity.**
- **java char takes up 2 bytes in memory.**
- Array stor in state memory

---
# Arrays-Creation 

### Operations in Arrays

- **runtime no change in array**
- **Array type is static.**


## Operation
<img width="707" alt="image" src="https://user-images.githubusercontent.com/78966839/197846539-c972d524-d76f-4057-a5c4-d69c04e30bd7.png">

# Creating an Array
<img width="650" alt="image" src="https://user-images.githubusercontent.com/78966839/197846903-a29327f2-af02-4d6c-94fb-cf99a1fc193b.png">

<img width="764" alt="image" src="https://user-images.githubusercontent.com/78966839/197847964-f3f77453-9a10-45ee-927c-bdb347f9b158.png">

```
        int marks[] = new int[50];// intiger array
        int numbers[] = { 1, 2, 3 };
        int Morenumbers[] = { 4, 5, 6 };
        String fruits[] = { "Apple", "mango" };
       
```
---
# Arrays- input,output& Update

```
import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create
        int mark[] = new int[10];
        // input
        System.out.println("Enter Your mark");
        mark[0] = sc.nextInt();// phy
        mark[1] = sc.nextInt();// chm
        mark[2] = sc.nextInt();// math

        // Output
        System.out.println("Phy " + mark[0]);
        System.out.println("chm " + mark[1]);
        System.out.println("math " + mark[2]);

        // Change
        // mark[0] += 1;
        // System.out.println("Updated Phy " + mark[0]);
        // Update
        // mark[2] = 87;
        // System.out.println("Updated Math " + mark[2]);

        // Percentage
        int percentage = (mark[0] + mark[1] + mark[2]) / 3;
        System.out.println("Your Percentage is " + percentage);
        sc.close();

    }
}
```
- **Length**
```
  // Length
        System.out.println("length of array is " + mark.length); // 10
```
---

# Arrays as Function Arguments
### Passing arrays as argument

- **Array is pass by referance**
- if referance value change it reflact the main value.

<img width="728" alt="image" src="https://user-images.githubusercontent.com/78966839/198074080-23c6624f-3a1c-4994-8541-80e5cd52db8f.png">

```

public class ArrayFunArg {
    public static void update(int mark[]) {
        for (int i = 0; i < mark.length; i++) {
            mark[i] = mark[i] + 1;
        }
    }

    public static void main(String[] args) {
        int mark[] = { 66, 55, 44 };
        update(mark);
        // Print the marks
        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i] + " "); // 67,56,45
        }
        System.out.println();// next line
    }
}
// referance reflact the value in main function
```
---
## NOTE : In some videos, you will hear about words like Space & Time Complexity of Algorithms, big Oh etc.The concept of Space & Time Complexity is covered in the later part of the course(as anindividual chapter).To be able to understand it before that, please read this reading material

<img width="394" alt="image" src="https://user-images.githubusercontent.com/78966839/198079630-ac3d631c-e72e-4266-9906-c745d0da96bf.png">

<img width="381" alt="image" src="https://user-images.githubusercontent.com/78966839/198079712-dd67c2f5-6ec0-4003-a2a6-a4270c4da447.png">

<img width="370" alt="image" src="https://user-images.githubusercontent.com/78966839/198079791-0e63af74-1a52-45e6-aedd-a27b50f82435.png">
---

# Linear Search 0(n)

- **Time complicaty:- prigram time take to exicute**
- **Linear Search Time complicaty 0(n)**
- Time complicaty is proportional to n.

<img width="710" alt="image" src="https://user-images.githubusercontent.com/78966839/198083180-9fe43ef5-9189-4dda-984b-945136b1f541.png">

<img width="714" alt="image" src="https://user-images.githubusercontent.com/78966839/198086816-55599df6-b7d0-435c-997f-5611ee2a982d.png">



```
public class LinearSearch {
    public static int linear_search(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 12, 54, 99, 22, 88, 55, 44, 14, 10 };
        int key = 10;

        int index = linear_search(number, key);
        if (index == -1) {
            System.out.println("Not exist");
        } else {
            System.out.println("Key found in index no " + index);
        }
    }
}
```
---
# Largest Number

<img width="817" alt="image" src="https://user-images.githubusercontent.com/78966839/198087989-744b1c77-0b96-4b05-830c-42975af0465f.png">

```

public class Largest {
    public static int get_largest(int number[]) {
        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE; // + infinity
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is " + smallest); // Smallest
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 12, 54, 69, 22, 88, 55, 44, 14, 10 };
        System.out.println("largest value is: " + get_largest(number));
    }
}
```



