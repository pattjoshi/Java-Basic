- class name file name shood same

<img width="660" alt="image" src="https://user-images.githubusercontent.com/78966839/195996369-b6aaeb5f-ad5b-4860-b24a-48d5550a8bca.png">

## Variables in java
<img width="749" alt="image" src="https://user-images.githubusercontent.com/78966839/195997524-f63e9eff-a83d-4537-bed2-b534f71f9a24.png">

Literal:- constant
variable :- change
Identifier :- Name in java (variable name)

## Memort
<img width="735" alt="image" src="https://user-images.githubusercontent.com/78966839/195997724-715ba962-da1c-45f8-8242-9ebccdc89453.png">

```
public class javaBasic {
    public static void main(String[] args) {
        // variable
        int a = 10;
        int b = 5;
        System.out.println(a); // 10
        System.out.println(b); // 5
        String name = "om";
        System.out.println(name); // om
        a = 50;
        System.out.println(a); // 50

    }
}
```
---
# Data Type in Java

<img width="764" alt="image" src="https://user-images.githubusercontent.com/78966839/195998242-7d50d41c-88e1-475c-aefd-5a7983545be2.png">

# Size of Data Type

<img width="936" alt="image" src="https://user-images.githubusercontent.com/78966839/195998631-d0296918-effa-477a-b37a-a7e56b50c6fb.png">


# Sum of a & b
<img width="609" alt="image" src="https://user-images.githubusercontent.com/78966839/195998746-a2b0a4fe-8155-40c8-aefb-1e227fd68d1d.png">

# Sum of a & b in Memory
<img width="744" alt="image" src="https://user-images.githubusercontent.com/78966839/195998864-77c4adc6-ea52-46ac-b2ba-068dc89c9fb6.png">

```
public class javaBasic {
    public static void main(String[] args) {
        // Primitive data type
        int a = 10;
        int b = 44;
        int sum = a + b;
        System.out.println(sum);

    }
}
```
# Comment
<img width="586" alt="image" src="https://user-images.githubusercontent.com/78966839/195999096-477e4e27-9fe2-4e5d-9fe4-a9b9d5436103.png">

# input 
<img width="528" alt="image" src="https://user-images.githubusercontent.com/78966839/195999427-71d301fc-2618-4715-9bbe-bd6fd96b0706.png">


```
import java.util.Scanner;

public class javaBasic {
    public static void main(String[] args) {
        // Primitive data type
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("The input is:-  " + input);
        sc.close();

    }
}
```

# Sum of a and b user input 
```
import java.util.Scanner;

public class javaBasic {
    public static void main(String[] args) {
        // Primitive data type
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + "and " + b + "is :- " + sum);
        sc.close();
    }
}
```

# Area of a circle
```
import java.util.Scanner;

public class javaBasic {
    public static void main(String[] args) {
        // Calculate area of a circle
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float pi = 3.14f;
        float radious = pi * r * r;
        System.out.println(radious);

        sc.close();
    }
}

```

# Type Conversion
<img width="760" alt="image" src="https://user-images.githubusercontent.com/78966839/196001797-f7df97b5-e6c0-420a-b815-d7daf1cc5a49.png">

# Type casting

<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/196002121-1514eb15-beb8-440f-9a3b-9a3a5f71c8c3.png">

# Type Promotion in Expressions

<img width="768" alt="image" src="https://user-images.githubusercontent.com/78966839/196002384-e4c9b7ed-6246-46de-b749-9d3ec60411f6.png">

```

public class javaBasic {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(b - a);

    }
}
```

<img width="666" alt="image" src="https://user-images.githubusercontent.com/78966839/196002804-f80f64c4-bad8-47a0-8da8-e75e5e7c869a.png">



# How is our code Running ?

<img width="460" alt="image" src="https://user-images.githubusercontent.com/78966839/196002987-98f5815b-a010-4155-8f26-b43d484be6ad.png">


<img width="724" alt="image" src="https://user-images.githubusercontent.com/78966839/196002974-4147ac62-602a-4cb3-b87a-b851d5ccd135.png">

---

<img width="352" alt="image" src="https://user-images.githubusercontent.com/78966839/196019162-69428b02-0136-464f-8435-1d6670fb942f.png">

## Solution
<img width="505" alt="image" src="https://user-images.githubusercontent.com/78966839/196019139-e8fb648b-78e8-4edc-a1be-7ac853af0cce.png">










