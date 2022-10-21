# Function & Method

- Block of code Perform the particular task again and again.(function)
- it is a reuseble part of code.

<img width="927" alt="image" src="https://user-images.githubusercontent.com/78966839/197203428-dee569c1-0fa5-4ceb-bb8c-c304e2dfded9.png">

### Syntex 

<img width="802" alt="image" src="https://user-images.githubusercontent.com/78966839/197206563-e7130792-fd43-43ad-b6f5-486d3effacfb.png">


- void :- Khali (not ruturn anything)
- main :-execution Stating pint  
- public static :- access modifier
-   main is a resurved word in java
-  main is a method
- input String is a array of string
- String[] args is a parameter
- public is a access modifier
-  if return type is int then return must be intiger  (return 1;)
  

```

public class HlowrdFun {
    // function of Hello world
    public static void PrintHelloWorld() { // function name : PrintHelloWorld without agrument
        System.out.println("Hello World");
        return;
    }

    public static void main(String[] args) { // void is rutrn type:- void not ruturn anything
     

        // Body of the method
        PrintHelloWorld(); // calling function
        // without agrument

    }

}
```
---
## Syntex with Paramenters

<img width="956" alt="image" src="https://user-images.githubusercontent.com/78966839/197210499-341fc2c9-633a-428e-9b8f-03b5c7e135be.png">

```
import java.util.Scanner;

public class SumFunc {
    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2; // This num 1 and num 2 Only for this class (Scope)
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum of 2 Number is" + sum);

        sc.close();

    }
}
```
----
## Parameter vs Argument
- **paramenter :- Function definition**
- **Arguments :- Funciion call**

<img width="755" alt="image" src="https://user-images.githubusercontent.com/78966839/197218211-b10bf846-6b2b-41e1-b539-be424e39ed59.png">

---
## whar happens in Memory

- When the fumction is call memory is resurb
- see rerurn statment it exir peogram.

<img width="949" alt="image" src="https://user-images.githubusercontent.com/78966839/197219640-e389d657-8688-4c9f-96c6-52ade8a5bcd9.png">




