# Recursion Basic
- **If you Imagin Stack Analysis  and tree graph of Recurshion it's you are in right path**


- bare minimum concept to learn Recurshion :- Iteration,Gunction
- Recursion use in :- Tree,Graph,DP

<img width="621" alt="image" src="https://user-images.githubusercontent.com/78966839/202265670-005b849c-6105-4d54-9483-6f9a6c53e144.png">


<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/202191002-8c409437-6bf8-4077-b8c6-5163e08510a6.png">

### Recursion Function  :- call It's self of the small Problem.

## Recursion Make Flow
<img width="736" alt="image" src="https://user-images.githubusercontent.com/78966839/202191838-9e7f00f1-7696-48ce-a297-e103b7ac2545.png">

### Recursion LFearn with Digram
<img width="440" alt="image" src="https://user-images.githubusercontent.com/78966839/202192622-2d3381f3-1db8-4fef-8e5d-73afa1bea3ea.png">

## Stape to compleate Recurshion
<img width="443" alt="image" src="https://user-images.githubusercontent.com/78966839/202193256-b223bd08-0de6-4494-850f-9504f9a50941.png">

# Print a number 1 to n (Decreasing order)

<img width="706" alt="image" src="https://user-images.githubusercontent.com/78966839/202194525-a0c22b25-c8c0-4a8d-93a3-042153f36742.png">

# Approch
<img width="318" alt="image" src="https://user-images.githubusercontent.com/78966839/202226391-5ac0359f-5485-44e0-8a9c-36c53792484d.png">


```
// // Print a number 1 to n (Decreasing order)

public class DecrementPrint {

    public static void printDec(int n) {
        if (n == 1) { // Base case
            System.out.print(n);
            return;
        }
        System.out.println(n + " "); // what to do
        printDec(n - 1); // Inner function

    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}
```
## How work in side menory ?

- In java One Function call another Function it create call Stack.
## Call satck

<img width="727" alt="image" src="https://user-images.githubusercontent.com/78966839/202243535-544922a8-5c27-4529-89f2-efdd9c174e13.png">

<img width="747" alt="image" src="https://user-images.githubusercontent.com/78966839/202243949-38c1ac88-d7ca-4871-9835-04db54ff4b55.png">

- **Use Base-case in Recurshion**
- if not use base case stack over flow error is occer
<img width="745" alt="image" src="https://user-images.githubusercontent.com/78966839/202251713-cb13ffdf-958a-4e9c-ad94-daa981592d76.png">

# Print Number n to 1 increasing order

<img width="373" alt="image" src="https://user-images.githubusercontent.com/78966839/202262944-df72446b-e208-4cf0-a889-436ee8644ab0.png">

## Approch
<img width="259" alt="image" src="https://user-images.githubusercontent.com/78966839/202263035-264c7385-f4c4-4e12-84d6-61a739aadaaf.png">

```
public class IncPrint {
    // Print Number n to 1 increasing order
    public static void IncrementPrint(int n) {
        if (n == 1) { // Base case
            System.out.print(n + " ");
            return;
        }
        IncrementPrint(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        IncrementPrint(n);
    }
}
```
## Call stack Increase
<img width="749" alt="image" src="https://user-images.githubusercontent.com/78966839/202263950-b67e3f1f-3269-4ee4-93a8-1280c5560b46.png">
<img width="771" alt="image" src="https://user-images.githubusercontent.com/78966839/202264343-33b4be72-87a4-4441-a061-99f84df8931a.png">

# Print Factorial of a number n.
<img width="684" alt="image" src="https://user-images.githubusercontent.com/78966839/202415642-bc7f3d4e-c214-494c-a33a-a967a3b1620b.png">

```
public class FactoRialNumber {
    // Print factorial of a number
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n)); // 120
    }
}

// n * fact(n - 1) ---> 1 * 1 = 1
// 1 * 2 = 2
// 2 * 3 = 6
// 6 * 4 = 24
// 24 * 5 = 120
```
## Stack Analysis s1
<img width="754" alt="image" src="https://user-images.githubusercontent.com/78966839/202428676-d7d90d81-5d3f-4772-9b41-03077da0ffa4.png">

## Stack Analysis s2
- **T.c = o(n)**
- **S.C = o(n)**
<img width="740" alt="image" src="https://user-images.githubusercontent.com/78966839/202429395-41da4ccb-cca5-4049-a50a-2bac181fc51a.png">

# Print sum of first n natural number
<img width="698" alt="image" src="https://user-images.githubusercontent.com/78966839/202436986-533cf47d-8eba-48f0-bc6a-af7779348dcb.png">

<img width="426" alt="image" src="https://user-images.githubusercontent.com/78966839/202439278-5ac1cea7-e52b-446f-8641-04b59e447ff2.png">

```
public class NnaturalNum {
    // Print the sum of n natural number
    public static int CalcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sn = n + CalcSum(n - 1);
        return sn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalcSum(n));
    }
}
```

## Callstack Analys s1
<img width="745" alt="image" src="https://user-images.githubusercontent.com/78966839/202440573-7f44088a-61ab-4ada-86ca-defb36518b30.png">

## Callstack Analys s2
- **T.C o(n)**
- **S.c o(n)**
<img width="718" alt="image" src="https://user-images.githubusercontent.com/78966839/202440893-a80e6220-5f0d-4a1e-ae79-cb5ba74275d2.png">

# Print the nth of Fibonashi number.

<img width="709" alt="image" src="https://user-images.githubusercontent.com/78966839/202496070-84857978-a7cc-476c-8679-313c559b9e0e.png">

## Base case
<img width="193" alt="image" src="https://user-images.githubusercontent.com/78966839/202498080-fe4492c9-edf3-4738-a42b-efa3ea63761c.png">


- **fin(n) = fin(n-1) + fin(n-2)**
- **Sum of last 2 Number**
- **n = 5**
- fib(4) = 3
- fib(3) = 2
- Add fib(4) + fib(3) = 5

<img width="401" alt="image" src="https://user-images.githubusercontent.com/78966839/202498836-e1ba6777-a0c4-47e5-8058-ac5fe6d78d4d.png">

## Approch
<img width="685" alt="image" src="https://user-images.githubusercontent.com/78966839/202500644-3253c860-e2d0-418f-a0f3-d6be7135b246.png">

```
public class Fibonashi {
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibo(n)); // 8

    }
}

// Fibonasi is Sum of last 2 number
// fib(n) = fin(n-1) + fin(n-2)
```

# Callstack Analysis s1
<img width="737" alt="image" src="https://user-images.githubusercontent.com/78966839/202505868-132219b9-da90-4337-81ed-2fcc3dcd0f2e.png">

# Callstack Analysis s1
<img width="747" alt="image" src="https://user-images.githubusercontent.com/78966839/202507732-4a1ce47e-9132-4f03-8530-db123e4b1341.png">

## Time and space complexcity
<img width="588" alt="image" src="https://user-images.githubusercontent.com/78966839/202510406-18621f53-c044-493a-beff-c81cd5df824e.png">

# Check of a given array is sorted or not.(assending)

<img width="556" alt="image" src="https://user-images.githubusercontent.com/78966839/202520918-fe5130c8-0c0c-48f6-bca5-c88250cf52f0.png">

<img width="749" alt="image" src="https://user-images.githubusercontent.com/78966839/202522860-efd634df-528d-433a-a5fc-37293222e7f2.png">

## Approch

<img width="305" alt="image" src="https://user-images.githubusercontent.com/78966839/202524587-008d0dbb-a384-4e94-a4f8-21fd52c5b820.png">

```
public class isSorted {
    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 9, 5 };
        System.out.println(issorted(arr, 0));
    }
}
```
## Stack analysis s1
<img width="705" alt="image" src="https://user-images.githubusercontent.com/78966839/202535003-69c515f7-8395-471b-944c-343c2c909602.png">


## Stack analysis s1
<img width="710" alt="image" src="https://user-images.githubusercontent.com/78966839/202524899-4d0163c0-b351-4746-814e-55c276131f02.png">

## Time and Space complexcity
<img width="133" alt="image" src="https://user-images.githubusercontent.com/78966839/202525410-383e921a-8d1f-4f1f-b295-af3baa3f113f.png">


# WAF to find the first occurence of an element in an array.

<img width="644" alt="image" src="https://user-images.githubusercontent.com/78966839/202688878-91f87977-b7ef-42ba-b559-04bab94fb33f.png">

- **if key is not found then return -1**
# Approch
<img width="181" alt="image" src="https://user-images.githubusercontent.com/78966839/202689168-3e193c0c-c6f9-4b96-831c-d83155655a52.png">

```
public class FirstOccer {
    // find the first occerance of an element in array
    public static int Occ1st(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;// Key is not found
        }
        if (arr[i] == key) {
            return i;
        }
        return Occ1st(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 7, 6, 5, 3, 6, 5 };
        System.out.println(Occ1st(arr, 5, 0));
    }
}
```
## Stack analysis s1

<img width="737" alt="image" src="https://user-images.githubusercontent.com/78966839/202693080-4e567639-3a39-49b8-93a2-f69f92de9cb4.png">

## Stack analysis s2
<img width="722" alt="image" src="https://user-images.githubusercontent.com/78966839/202693240-a88aeacf-1d87-408b-85ad-087fac04af48.png">

### Tc and sc
<img width="150" alt="image" src="https://user-images.githubusercontent.com/78966839/202693295-2c0f2f9c-1e61-43ec-ad49-c3878cf3a977.png">

# Wap find the last occerance of in array

<img width="689" alt="image" src="https://user-images.githubusercontent.com/78966839/202699853-e3c72adf-509a-486b-9438-b23edf2dc04f.png">

```
public class LastOccrance {
    public static int Lastocc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1; // not exist
        }
        int isLast = Lastocc(arr, key, i + 1); // Look forword
        if (arr[i] == key && isLast == -1) { // check with self
            return i;
        }
        return isLast;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 7, 6, 5, 3, 6, 5 };
        System.out.println(Lastocc(arr, 5, 0));
    }
}
```
# Print X^n

<img width="582" alt="image" src="https://user-images.githubusercontent.com/78966839/202755716-83f79d42-77f2-4f75-ad3e-53ce1f51939a.png">

## Basic approch
<img width="464" alt="image" src="https://user-images.githubusercontent.com/78966839/202756765-b90b73c9-fe96-4628-9c39-7033cbbe9e41.png">

## Approch
<img width="387" alt="image" src="https://user-images.githubusercontent.com/78966839/202757456-580703b5-df26-45e6-aaaf-79701a0956d1.png">

## Code

```
public class PrintPower {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // 1 way
        // int pnm1 = power(x, n - 1);
        // int pn = x * pnm1;
        // return pn;
        // 2 way
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10)); // 1024
    }
}
```

## Call stack
<img width="738" alt="image" src="https://user-images.githubusercontent.com/78966839/202762289-28708703-992e-4c04-a173-6f8544e976da.png">

## Call stack
<img width="732" alt="image" src="https://user-images.githubusercontent.com/78966839/202762862-96427484-9fb5-43e8-b429-66c7d38e952f.png">

---
# Print X^n in 0
- look thin  as even and odd form

<img width="698" alt="image" src="https://user-images.githubusercontent.com/78966839/202850144-46a9782b-932e-4fec-a496-4805ef46ca37.png">

### Example
<img width="736" alt="image" src="https://user-images.githubusercontent.com/78966839/202850242-8b013248-025d-4785-a44e-bd2da1686144.png">

## Time c := o(logn)
<img width="734" alt="image" src="https://user-images.githubusercontent.com/78966839/202850323-b5cfa113-a54a-4cc8-a9fa-2624071d9b79.png">

```
public class PowerOptimize {
    // Power of x^n in o(log n)
    public static int OptimizeOpw(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // even
        int halfPow = OptimizeOpw(x, n / 2);
        int halfPowSq = halfPow * halfPow;
        // odd
        if (n % 2 != 0) {
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println(OptimizeOpw(2, 10)); // 1024
    }
}
```
---

# Tiling Problem
<img width="749" alt="image" src="https://user-images.githubusercontent.com/78966839/202859395-da3a5faa-55d6-4d78-93a4-8caba88aab91.png">

## Tiles are place in varticallt
<img width="698" alt="image" src="https://user-images.githubusercontent.com/78966839/202859522-86f691e9-3c82-4254-a41d-059f2ca3ef1b.png">

- Board = 2 * n
- 2 is Breath
- n is length

## Tiles are place in Horizontaly
<img width="662" alt="image" src="https://user-images.githubusercontent.com/78966839/202859554-94d8f9d0-1560-426a-8ccd-e887fbbcb1a9.png">

- **tile size "2 * 1"**
- 2 is Breath
- 1 is length

## Tiles are place in Horizontaly and varticallt
<img width="722" alt="image" src="https://user-images.githubusercontent.com/78966839/202859673-b6b9a6b4-2b32-484e-87c7-b58448b51585.png">

## Let's see with example with 3
- n = 3
- means 2 * 3
- tile 2 * 1

- **Count the different ways**
<img width="653" alt="image" src="https://user-images.githubusercontent.com/78966839/202860767-abeb98c0-1fd5-4da5-bfca-0966edda0033.png">

<img width="719" alt="image" src="https://user-images.githubusercontent.com/78966839/202860921-adad8bb6-84b3-476c-be34-dfed56991e79.png">

## Tiling proble approch


<img width="709" alt="image" src="https://user-images.githubusercontent.com/78966839/202861232-8fa593c8-6f94-4b77-a578-4ed7acf07341.png">

<img width="693" alt="image" src="https://user-images.githubusercontent.com/78966839/202861272-f0290b55-787b-48c7-8a01-c58d4a6f5b41.png">

- **1.Base case**
<img width="785" alt="image" src="https://user-images.githubusercontent.com/78966839/202861312-3280fb43-6af2-4321-9f2a-c4cc4ed4f5e7.png">

- **2.Kaam = chose**
<img width="676" alt="image" src="https://user-images.githubusercontent.com/78966839/202861496-17e0817d-8d9d-468a-b61a-76afb99567ba.png">

## varticae

- ist is feel 2 * n
- rest is feel 2 * n-1

<img width="613" alt="image" src="https://user-images.githubusercontent.com/78966839/202861588-2d1b9cd4-3b84-4cc0-b104-c80024576a7d.png">

<img width="646" alt="image" src="https://user-images.githubusercontent.com/78966839/202861683-12c2eb1d-5110-4e42-bc1a-e57e98bcef73.png">

## Horizontally
- **Once you place tile in Horizontally you can not place Vartically**
<img width="509" alt="image" src="https://user-images.githubusercontent.com/78966839/202861794-0b7b0581-a833-499c-aa44-eea272805514.png">

## total =  varticle + Horizontally

<img width="309" alt="image" src="https://user-images.githubusercontent.com/78966839/202861880-1d313a9b-ae21-4494-81d3-7fed624b5632.png">

- Base case :- (0 ,1) way 1
- Kaam := choice make

## Code
```
public class Tiling {
    public static int TilingProblem(int n) { // 2 * n (floor size)
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Kaam
        // varticaly
        int fnm1 = TilingProblem(n - 1);
        // Horizontaly
        int fnm2 = TilingProblem(n - 2);
        int total = fnm1 + fnm2;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(TilingProblem(4));

    }
}
```
# Remove Duplicates in string (a-z)
<img width="698" alt="image" src="https://user-images.githubusercontent.com/78966839/202885734-fc489225-c7d8-4a2f-915b-eae654020717.png">

## Variable decleariction

- **If the variable occer in 1st store 'T'**
<img width="755" alt="image" src="https://user-images.githubusercontent.com/78966839/202885977-908dfa3f-c3ea-45f3-9495-6972434d7733.png">

## How compiler know 'a' is in index 0
- In java Type converction
<img width="378" alt="image" src="https://user-images.githubusercontent.com/78966839/202886472-d1431a2b-3ffd-4ca4-b5b8-391d050cc3ba.png">

### How to find index of a character
- **index = Current char - 'a'**

<img width="516" alt="image" src="https://user-images.githubusercontent.com/78966839/202886693-59246e13-767b-45af-a5c8-1954a4078a39.png">

## Approch of recurshion
<img width="560" alt="image" src="https://user-images.githubusercontent.com/78966839/202886815-439aab3a-45d0-48c1-b855-d94d80a9c887.png">

```

public class RemDublication {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
```













