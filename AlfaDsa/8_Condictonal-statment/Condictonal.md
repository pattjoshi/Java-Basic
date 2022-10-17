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





