## Inreoduction

- Developing java program we need JDK (Java Development Kit).
- JRE :- Java Runtime Enverment (**exicute** java code)
- JVM :- java virtual machin
- .java is a extension.

- File save by name first.java
- first.class :- is byte code (genrate by compiler)
- Witout creation object we use static.
- println() is a method :- Printiing
- System :- class
- out :- object

## Reading from keybord

- Scanner :- reading the data from dierent sources (class)
- tiil :- Package
- ststem.in :- imput

## Class Scanner

```
nextInt() :- Intiger
nextFloat() :- Float
nextDouble() :- Double

---
next():- Single string
nextLine():- multiple Line string
---
nextByte() :- Byte
nextShort()
nextlogn()
nextBoolean()
---
## Next value is what ?
hasNextInt()
hasNextFloat()
---
```

### Code

```
package javaAbdulBariCourse.introduction;

import java.util.*;

// util is use for get user input
class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("Sub is " + c);

    }

}
```

<img width="837" alt="image" src="https://user-images.githubusercontent.com/78966839/192840039-b66db758-8eb7-4be3-a469-f1a7c531898a.png">
