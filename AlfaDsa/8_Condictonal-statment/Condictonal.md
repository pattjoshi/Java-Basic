# Condictonal Statments

<img width="817" alt="image" src="https://user-images.githubusercontent.com/78966839/196080321-42260462-7b4e-46c2-be8b-bbc7cc1dfc68.png">

## if-else Statements

<img width="833" alt="image" src="https://user-images.githubusercontent.com/78966839/196080845-b2e55dd6-d7e1-4995-ad97-31d0e179a5c0.png">

```
public class Condi {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Adult");
        }
        if (age >= 0 && age <= 17) {
            System.out.println("You are Teen"); 

        } else {
            System.out.println("Not adult");
        }

    }
}
```
# Largest of 2 Number

<img width="870" alt="image" src="https://user-images.githubusercontent.com/78966839/196086397-d83a003b-23c7-4585-a039-e4636727ac31.png">

```
public class Large2 {
    public static void main(String[] args) {
        int A = 8;
        int B = 9;
        if (A > B) {
            System.out.println("A Is Grater Then B");
        } else {
            System.out.println("B is Grater Than A");
        }
    }
}
```
# Even Odd

<img width="726" alt="image" src="https://user-images.githubusercontent.com/78966839/196088370-0bac003e-98df-45b2-b4e8-53c8a3dd4f0e.png">

```
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }

}
```
# Else if
<img width="864" alt="image" src="https://user-images.githubusercontent.com/78966839/196089933-6055242c-af32-4ead-b779-888464a311b8.png">

- Save computing time 


# Income tex
- Income < 5L 0% tex
- Income 5-10L 20% text
- Income > 10L 30% tex

<img width="819" alt="image" src="https://user-images.githubusercontent.com/78966839/196091728-7d6dfbb0-ef34-44cb-bc47-30aaac25553a.png">



```
import java.util.Scanner;

public class IncomeTex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Income = sc.nextInt();
        int tex;
        if (Income <= 500000) {
            tex = 0;
        } else if (Income <= 500000 && Income >= 1000000) {
            tex = (int) (Income * (0.2));
        } else {
            // 30 % tex
            tex = (int) (Income * (0.3));
        }
        System.out.println("Your tex is " + tex);
        sc.close();

    }
}
```
# Largest 3 Number
<img width="799" alt="image" src="https://user-images.githubusercontent.com/78966839/196159523-9e6c0528-47af-4d0b-a010-7f434ff28e13.png">

```
import java.util.Scanner;

public class Large3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Number");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A > B && A > C) {
            System.out.println("A is Grater " + A);
        } else if (B > C) {
            System.out.println("B is Grater " + B);
        } else {
            System.out.println("C is Grater " + C);
        }

        sc.close();

    }
}
```
---
# Ternary Operator
<img width="857" alt="image" src="https://user-images.githubusercontent.com/78966839/196220953-1169e042-af3f-44b6-8ca2-8427bb26c5fb.png">

```
public class Tar {
    public static void main(String[] args) {
        // Number is Even using ternary Operater
        int num = 2;
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(type);
    }

}
```

## Pass of Fail using ternary Operator
```
import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Mark");
        int marks = sc.nextInt();
        String Status = (marks > 33) ? "Pass" : "Fail";
        System.out.println("Your Report is " + Status);
        sc.close();
    }
}
```

# Switch Statement

<img width="758" alt="image" src="https://user-images.githubusercontent.com/78966839/196225312-a3bb4a8e-dd1d-4721-beb9-7d465ae04380.png">

<img width="830" alt="image" src="https://user-images.githubusercontent.com/78966839/196226506-c501c7c9-94be-4f7c-beea-bc445d63b3a3.png">

```
public class SwitchStatment {
    public static void main(String[] args) {
        int num = 3;
        switch (num) {
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Mango Shake");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
```

# Calculater 

```
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1 :- ");
        int a = sc.nextInt();
        System.out.println("Enter Num 2 :- ");
        int b = sc.nextInt();
        System.out.println("Enter Operater");
        char operater = sc.next().charAt(0);
        switch (operater) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}

```

# Practic qua

<img width="375" alt="image" src="https://user-images.githubusercontent.com/78966839/196232922-b674b520-2577-41ab-83d7-f397283ef76b.png">

<img width="884" alt="image" src="https://user-images.githubusercontent.com/78966839/196233036-b6a5d9a9-9c15-4c5a-8db4-895de37b5d05.png">

# Solution

<img width="366" alt="image" src="https://user-images.githubusercontent.com/78966839/196233175-4419714a-d989-46d9-a93f-9825139a5206.png">

<img width="370" alt="image" src="https://user-images.githubusercontent.com/78966839/196233333-0520992e-d4b7-476d-9f24-7edc7eebb75e.png">

<img width="377" alt="image" src="https://user-images.githubusercontent.com/78966839/196233649-89d37d43-030d-47a5-8fb7-0e74f6fa15b7.png">


