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

---
## Call by value


### Swap
- 
<img width="643" alt="image" src="https://user-images.githubusercontent.com/78966839/197241746-1ca5afe3-16f3-44b8-b582-efe1c81d4c96.png">

```
public class Swap2 {
    public static int swapOf2Number(int a, int b) {
        // Swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping A is " + a);
        System.out.println("After swaping B is " + b);
        return a;
    }

    public static void main(String[] args) {
        // Swap - the value
        swapOf2Number(15, 4); // a and b are creating a copy

    }
}
// in java allwayse calls by value
```

<img width="764" alt="image" src="https://user-images.githubusercontent.com/78966839/197242860-aadf62dd-52a0-4b74-a5e1-fdafb8eea01a.png">

<img width="620" alt="image" src="https://user-images.githubusercontent.com/78966839/197242903-315bcd7f-f0d6-4f5c-a23d-51e4739fdfb8.png">

- **Original variable creating a copy and then pass to Function.**

## Product of a and b
<img width="893" alt="image" src="https://user-images.githubusercontent.com/78966839/197243780-76ea499c-aa51-48b3-8021-320e6c1d6d5e.png">

```
public class Product {
    public static int multiplication(int a, int b) { // Parameter
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int product = multiplication(a, b);// argument
        System.out.println(product);

    }
}
```
---


# Factorial 
<img width="726" alt="image" src="https://user-images.githubusercontent.com/78966839/197252411-3b9c74ce-2873-460a-acc1-78499d789818.png">

### Logic
<img width="795" alt="image" src="https://user-images.githubusercontent.com/78966839/197252624-33c375fb-9c99-4a62-bf71-82ec570c9acd.png">

```
public class Factorial {
    public static int Faco(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {

        System.out.println(Faco(5));

    }
}
```

## DRY RUN
<img width="777" alt="image" src="https://user-images.githubusercontent.com/78966839/197254396-27d64943-2418-4b41-aed8-ba76e10e04ea.png">

---

## Binomial Coefficient
<img width="803" alt="image" src="https://user-images.githubusercontent.com/78966839/197268347-11a25a3b-aaef-42e0-bcd7-0fa8e286b785.png">

- Stape :- Helping function (factorial)
- stape2:- Create Binomial coff function
- factorial of A
- factorial Of B
- factorial of C= factorial(A-B)
- int bino = A /(B *c)

```
public class BinoMial {
    // facotrial
    public static int factorial(int number) { // Helper function
        int f = 1;
        for (int i = 1; i <= number; i++) {
            f *= i;
        }
        return f;
    }

    // Binomial coff
    public static int BinoCoffe(int n, int r) {
        int fac_n = factorial(n);
        int fac_r = factorial(r);
        int fac_nMr = factorial(n - r);
        int bincoeff = fac_n / (fac_r * fac_nMr);

        return bincoeff;
    }

    public static void main(String[] args) {
        System.out.println(BinoCoffe(5, 2));
    }
}

// Stape :- Helping function (factorial)
// stape2:- Create Binomial coff function
// factorial of A
// factorial Of B
// factorial of C= factorial(A-B)
// int bino = A /(B *c)
```
## Dry run
<img width="712" alt="image" src="https://user-images.githubusercontent.com/78966839/197269251-1bbf17fa-a7c1-4023-abeb-dc12832bb206.png">




