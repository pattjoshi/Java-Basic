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
















