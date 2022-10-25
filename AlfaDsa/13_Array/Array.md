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













