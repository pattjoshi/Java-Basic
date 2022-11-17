# Recursion Basic

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

















