# What is string ?

- String are Text representer.
- **String are IMMUTABLE in java**

## String Decleare
- Memory is alocated to str and the value is store "abc", "xyz"

<img width="264" alt="image" src="https://user-images.githubusercontent.com/78966839/200281121-3d14508b-668f-4589-8ab5-8c21f0ca4495.png">

# Input / Output

```
import java.util.Scanner;

public class StringDecleare {
    public static void main(String[] args) {
        char[] ch = { 'a', 'b', 'c' };
        String[] str = { "abc", "xyz" };

        // String are IMMUTABLE in java
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}

// Memory is alocated to str and the value is store "abc", "xyz"
// IMMUTABLE meaning not modify
```

# String Length()

```
String Hero = "Tony stack";
        System.out.println(Hero.length());
```
---

# String Concatenate

```
        // concinication
        String firstName = "Om Prakash";
        String lastName = "Pattjoshi";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName); // Om Prakash Pattjoshi
```

# PalimDrum String

<img width="853" alt="image" src="https://user-images.githubusercontent.com/78966839/200368880-41ef7b8f-4672-426d-b9e2-e6c65f5288aa.png">

<img width="568" alt="image" src="https://user-images.githubusercontent.com/78966839/200369474-7066aea5-a543-4239-8c54-3adfbd468d03.png">


```
public class StringPalimdrum {

    public static boolean Palim(String s) {
        for (int i = 0; i < s.length(); i++) {
            int n = s.length();
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                // Not a Palmdrom
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(Palim(s));
    }
}
```
# Shortest Path O(n)

<img width="662" alt="image" src="https://user-images.githubusercontent.com/78966839/200374880-5917cbbf-3612-4c7d-8fb5-4a40636ba2b9.png">

<img width="765" alt="image" src="https://user-images.githubusercontent.com/78966839/200375246-62c7fa07-22fe-47ab-bda2-af1778987e62.png">


```
public class Shortest {

    // find shotest path
    public static float getShotest(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i); // diraction
            // South
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShotest(path));
    }
}
```
# String Functions-Compare

- **The equals() method compares two strings, and returns true if the strings are equal, and false if not.**

- **using new key word now location creation in stack.**
- if we check value we shood not use == . Becouse it check in Object level.

```
String n1 = "Toney";
        String n2 = "Toney";
        String n3 = new String("Toney");

        if (n1 == n3) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        if (n1.equals(n3)) { // it check object
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
```

---

# SubString

<img width="679" alt="image" src="https://user-images.githubusercontent.com/78966839/200476597-918f0a85-aafe-4fe7-86bc-762fa83620c3.png">

```
public class SubString {

    // Sub string User define method
    public static String subString(String str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 0, 5)); // userDefid method
        System.out.println(str.substring(0, 6)); // Inbuld
    }
}
```
---

# Largest String

- **The compareToIgnoreCase() method compares two strings lexicographically, ignoring lower case and upper case differences.**

- **The compareTo() method compares two strings lexicographically.**

### T.c 0(x*n)

<img width="801" alt="image" src="https://user-images.githubusercontent.com/78966839/200480264-4db49d79-8028-47a7-8bff-e540563ada41.png">


```
public class LargestString {
    public static void main(String[] args) {
        String frote[] = { "zpple", "mango", "banana" };
        String larse = frote[0];
        for (int i = 1; i < frote.length; i++) {
            if (larse.compareTo(frote[i]) < 0) {
                larse = frote[i];
            }
        }

        System.out.println(larse);
    }

}
```

# What are string ?
<img width="719" alt="image" src="https://user-images.githubusercontent.com/78966839/200490443-d7f27c63-4745-4778-b331-b5b47f1bb3ea.png">

### String are immutablw in java
<img width="714" alt="image" src="https://user-images.githubusercontent.com/78966839/200491121-ad61607f-192f-40ca-b4ca-ac2855afb2d5.png">

# What is StringBuilder in java ?

- **StringBuilder in Java is a class used to create a mutable, or in other words, a modifiable succession of characters**

<img width="772" alt="image" src="https://user-images.githubusercontent.com/78966839/200493526-75528b7b-0fdb-4d89-8411-6d57cbda7d43.png">

```
public class StrBuilder {
    public static void main(String[] args) { // O(26)
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}

```







