# Loop (flow control)

<img width="767" alt="image" src="https://user-images.githubusercontent.com/78966839/196480372-7a8bd004-1cc9-4324-8d63-3493f1cf449d.png">

# While loop

<img width="878" alt="image" src="https://user-images.githubusercontent.com/78966839/196482279-cff4b512-d25c-434e-8fd0-7630b0643bde.png">

```
public class WhileHelloWorld100T {
    public static void main(String[] args) {
        // Print Hello Alien 100 time using while loop
        int conunt = 0; // conunting up to 100
        while (conunt < 100) { // this is blocl of code this only run
            System.out.println("Hello , Alien !");
            conunt++; // this rund up to the count in 100
        }
        System.out.println("Print 100 Time");

    }

}
```
# Print number from 1 to 10

<img width="870" alt="image" src="https://user-images.githubusercontent.com/78966839/196485451-cfc9f69f-0dab-492c-8fba-1bb1a6f3071b.png">

```
public class Print1to10 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }
}
```

<img width="810" alt="image" src="https://user-images.githubusercontent.com/78966839/196489191-ed8d3799-8e95-4404-ab18-c2a65b9a60c0.png">

# Print number from 1 to n
```
import java.util.Scanner;

public class Print1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int range = sc.nextInt();
        int count = 1;
        while (count <= range) {
            System.out.println(count);
            count++;
        }
        sc.close();
    }
}
// Print 1 to n
```
# Sum Of N natural Number

<img width="879" alt="image" src="https://user-images.githubusercontent.com/78966839/196492489-565ca00f-4235-4ed8-89e3-24207f482900.png">

```
import java.util.Scanner;

public class SumofN_NaturalMum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i; // sum = sum+i;
            i++;
        }
        System.out.println("Sum is " + sum);

        sc.close();
    }
}
```
# for loop

<img width="770" alt="image" src="https://user-images.githubusercontent.com/78966839/196500434-7ed9c4ea-a0ed-4349-93fb-09e1e40dbe95.png">

```
public class forHelloWorld {
    public static void main(String[] args) {
        // Print Hello world 10 Time using for loop
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println("Hell world");
        }
    }
}
```
# SQUARE Pattren

<img width="799" alt="image" src="https://user-images.githubusercontent.com/78966839/196503785-c213402b-ee82-447f-a67f-04d288e02ff2.png">


```
public class squarePattren {
    public static void main(String[] args) {
        // Print star using for loop
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }
    }
}

```
# Print Reverse of a number

<img width="884" alt="image" src="https://user-images.githubusercontent.com/78966839/196511070-b46fbdd5-57a8-45d2-ade2-604f3330284d.png">

  ```
  public class ReverseOfaNumber {
    public static void main(String[] args) {
        // Reverse of a Number
        int num = 13485;
        while (num > 0) {
            int last = num % 10;
            System.out.print(last);
            num /= 10;
        }
    }
}
```

# Reverse the given number

<img width="754" alt="image" src="https://user-images.githubusercontent.com/78966839/196676521-b1700514-6afe-42ab-887a-7d3ce71e4bba.png">

```
public class ReverseTheNumber {
    public static void main(String[] args) {
        int num = 15099;
        int reverse = 0;
        while (num > 0) {
            // Reverse the num get a nue number
            int LD = num % 10;
            reverse = (reverse * 10) + LD;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
```
---
# do-while Loop
<img width="410" alt="image" src="https://user-images.githubusercontent.com/78966839/196683925-54fec6d4-4116-4779-9f18-b2ca9a7dbc73.png">

- exicute then check condiction.

## Hello world in do while loop

```
public class HelloWorldDowhile {
    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println("Hello World !");
            counter++;
        } while (counter < 10);
        System.out.println("10x time print Hello world");

    }
}
```


# Breake 

<img width="796" alt="image" src="https://user-images.githubusercontent.com/78966839/196686606-c32fb9e3-6d36-459d-a91b-2039b9709783.png">

```
public class Break {
    public static void main(String[] args) {
        // Break statment is use for Breake the code
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am Out from Loop");
    }
}
```
# Break qus

<img width="960" alt="image" src="https://user-images.githubusercontent.com/78966839/196688885-bc85d3bf-a2b0-453d-be6b-dd9042fbfd77.png">

```
import java.util.Scanner;

public class BrQus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a Number");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println("Your Number is " + num);
        } while (true);
        sc.close();
    }
}
```

# continue Statement 
- to skip an iteration
<img width="785" alt="image" src="https://user-images.githubusercontent.com/78966839/196706545-5eb49c73-6da4-4952-8e05-b2a1e78737f7.png">

```
public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```
<img width="859" alt="image" src="https://user-images.githubusercontent.com/78966839/196707616-5e881789-0acc-4944-ac9f-c98cdd9f2281.png">


## Display all the number entered By user except multiples of 10

```
import java.util.Scanner;

public class contqus {
    public static void main(String[] args) {

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Number");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println("Your Number is " + num);

        } while (true);

    }
}
```










