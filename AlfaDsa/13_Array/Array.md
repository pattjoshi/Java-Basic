# Introduction

- **Collection of similar DataType**
- placed in a contiguous memory location
- list type structure

<img width="804" alt="image" src="https://user-images.githubusercontent.com/78966839/197843046-b029608f-802b-4ed7-b98d-4092eb7a5ac7.png">

<img width="805" alt="image" src="https://user-images.githubusercontent.com/78966839/197843310-371c1eaa-de9b-4acb-a0cd-61297c00ae1f.png">

<img width="782" alt="image" src="https://user-images.githubusercontent.com/78966839/197843809-b846428d-c53b-4b20-a5d5-9173aab0f359.png">


<img width="820" alt="image" src="https://user-images.githubusercontent.com/78966839/197844441-5fe70e2b-0603-4368-a2c8-09713fb52f3a.png">

- **Hear char size is taken as 1 byte for simplicity.**
- **java char takes up 2 bytes in memory.**
- Array stor in state memory

---
# Arrays-Creation 

### Operations in Arrays

- **runtime no change in array**
- **Array type is static.**


## Operation
<img width="707" alt="image" src="https://user-images.githubusercontent.com/78966839/197846539-c972d524-d76f-4057-a5c4-d69c04e30bd7.png">

# Creating an Array
<img width="650" alt="image" src="https://user-images.githubusercontent.com/78966839/197846903-a29327f2-af02-4d6c-94fb-cf99a1fc193b.png">

<img width="764" alt="image" src="https://user-images.githubusercontent.com/78966839/197847964-f3f77453-9a10-45ee-927c-bdb347f9b158.png">

```
        int marks[] = new int[50];// intiger array
        int numbers[] = { 1, 2, 3 };
        int Morenumbers[] = { 4, 5, 6 };
        String fruits[] = { "Apple", "mango" };
       
```
---
# Arrays- input,output& Update

```
import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create
        int mark[] = new int[10];
        // input
        System.out.println("Enter Your mark");
        mark[0] = sc.nextInt();// phy
        mark[1] = sc.nextInt();// chm
        mark[2] = sc.nextInt();// math

        // Output
        System.out.println("Phy " + mark[0]);
        System.out.println("chm " + mark[1]);
        System.out.println("math " + mark[2]);

        // Change
        // mark[0] += 1;
        // System.out.println("Updated Phy " + mark[0]);
        // Update
        // mark[2] = 87;
        // System.out.println("Updated Math " + mark[2]);

        // Percentage
        int percentage = (mark[0] + mark[1] + mark[2]) / 3;
        System.out.println("Your Percentage is " + percentage);
        sc.close();

    }
}
```
- **Length**
```
  // Length
        System.out.println("length of array is " + mark.length); // 10
```
---

# Arrays as Function Arguments
### Passing arrays as argument

- **Array is pass by referance**
- if referance value change it reflact the main value.

<img width="728" alt="image" src="https://user-images.githubusercontent.com/78966839/198074080-23c6624f-3a1c-4994-8541-80e5cd52db8f.png">

```

public class ArrayFunArg {
    public static void update(int mark[]) {
        for (int i = 0; i < mark.length; i++) {
            mark[i] = mark[i] + 1;
        }
    }

    public static void main(String[] args) {
        int mark[] = { 66, 55, 44 };
        update(mark);
        // Print the marks
        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i] + " "); // 67,56,45
        }
        System.out.println();// next line
    }
}
// referance reflact the value in main function
```
---
## NOTE : In some videos, you will hear about words like Space & Time Complexity of Algorithms, big Oh etc.The concept of Space & Time Complexity is covered in the later part of the course(as anindividual chapter).To be able to understand it before that, please read this reading material

<img width="394" alt="image" src="https://user-images.githubusercontent.com/78966839/198079630-ac3d631c-e72e-4266-9906-c745d0da96bf.png">

<img width="381" alt="image" src="https://user-images.githubusercontent.com/78966839/198079712-dd67c2f5-6ec0-4003-a2a6-a4270c4da447.png">

<img width="370" alt="image" src="https://user-images.githubusercontent.com/78966839/198079791-0e63af74-1a52-45e6-aedd-a27b50f82435.png">
---

# Linear Search 0(n)

- **Time complicaty:- prigram time take to exicute**
- **Linear Search Time complicaty 0(n)**
- Time complicaty is proportional to n.

<img width="710" alt="image" src="https://user-images.githubusercontent.com/78966839/198083180-9fe43ef5-9189-4dda-984b-945136b1f541.png">

<img width="714" alt="image" src="https://user-images.githubusercontent.com/78966839/198086816-55599df6-b7d0-435c-997f-5611ee2a982d.png">



```
public class LinearSearch {
    public static int linear_search(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 12, 54, 99, 22, 88, 55, 44, 14, 10 };
        int key = 10;

        int index = linear_search(number, key);
        if (index == -1) {
            System.out.println("Not exist");
        } else {
            System.out.println("Key found in index no " + index);
        }
    }
}
```
---
# Largest Number

<img width="817" alt="image" src="https://user-images.githubusercontent.com/78966839/198087989-744b1c77-0b96-4b05-830c-42975af0465f.png">

```

public class Largest {
    public static int get_largest(int number[]) {
        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE; // + infinity
        for (int i = 0; i < number.length; i++) {
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.println("Smallest value is " + smallest); // Smallest
        return largest;
    }

    public static void main(String[] args) {
        int number[] = { 12, 54, 69, 22, 88, 55, 44, 14, 10 };
        System.out.println("largest value is: " + get_largest(number));
    }
}
```
---
# Binary Search
- **Prerequisite- Sorted arrays**

<img width="750" alt="image" src="https://user-images.githubusercontent.com/78966839/198100594-134665a5-7959-4332-be45-8bcaa3af76aa.png">

<img width="758" alt="image" src="https://user-images.githubusercontent.com/78966839/198100918-15285b69-6447-4404-92dc-664dfd4b9267.png">

<img width="782" alt="image" src="https://user-images.githubusercontent.com/78966839/198101851-3a179e45-0fda-44c5-a2df-03c6826909ab.png">

### Binary search Summery
- **mid < key 2nd half**
- **mid > key 1nd half**

<img width="747" alt="image" src="https://user-images.githubusercontent.com/78966839/198106420-fd34b14d-2730-4672-aa55-ec100f192412.png">

### Pseudo code of Binary search

<img width="797" alt="image" src="https://user-images.githubusercontent.com/78966839/198107333-eeae7fc9-243d-4eae-b557-170a2a510d48.png">

### Binary search time complacaty
- **Binary search time complacaty is less**
<img width="785" alt="image" src="https://user-images.githubusercontent.com/78966839/198110907-c5298a7e-9f41-48f0-863a-9cf00d46be1e.png">

<img width="689" alt="image" src="https://user-images.githubusercontent.com/78966839/198111177-976c9ac6-ed1a-4e31-bc5a-41156c544a4a.png">


```
public class BinarySearch {
    public static int get_largest_Bs(int number[], int key) {
        int start = 0, end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisions
            if (number[mid] == key) {// found
                return mid;
            }

            if (number[mid] < key) { // right
                start = mid + 1;
            } else { // left 1st haf
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 14 };// must be sorting array
        int key = 14;
        System.out.println(get_largest_Bs(number, key));
    }
}
```
---

# Reverse an Array
<img width="658" alt="image" src="https://user-images.githubusercontent.com/78966839/198340305-a5597ea5-fd3c-47f0-8894-e9694f3786c7.png">

<img width="867" alt="image" src="https://user-images.githubusercontent.com/78966839/198341072-92e66179-c960-418b-834c-d595d58769a4.png">
#### swap
<img width="761" alt="image" src="https://user-images.githubusercontent.com/78966839/198350320-6e7fdbd6-c1b1-45ed-b0f9-58bb4da3e3fa.png">

```
public class Reverse {
    // reverse an array
    public static void reverse(int number[]) {
        int start = 0;
        int last = number.length - 1;
        while (start < last) {
            // swap
            int temp = number[last];
            number[last] = number[start];
            number[start] = temp;

            start++; // increase 1 index
            last--; // decrease 2 index

        }
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 4, 6, 12, 23, 45 };
        reverse(number);// function call
        // Prints the number
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();

    }
}
```
# Pairs in array
<img width="699" alt="image" src="https://user-images.githubusercontent.com/78966839/198355140-3932249b-b219-405f-b00c-7a938c8e07e0.png">

<img width="710" alt="image" src="https://user-images.githubusercontent.com/78966839/198355260-6ac7fa5d-0875-451d-8589-61d03d75b788.png">

### Total no of part
<img width="323" alt="image" src="https://user-images.githubusercontent.com/78966839/198359749-c9d65e75-0a93-4d35-a9a8-a50543336450.png">

```
public class Pairs {
    public static void pairs_pattren(int number[]) {
        // Outer layer
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i]; // 2,4,6,8,10
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pair is " + tp);
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        pairs_pattren(number);
       

    }
}
```
<img width="489" alt="image" src="https://user-images.githubusercontent.com/78966839/198360236-fce021c9-b2b8-4e7f-993b-47a54467106a.png">

---
# SubArray
- **a continous part of array**
<img width="698" alt="image" src="https://user-images.githubusercontent.com/78966839/198367657-5476e0cf-c918-4948-bcac-a7bce4d22c59.png">

<img width="719" alt="image" src="https://user-images.githubusercontent.com/78966839/198367481-4ee3487c-d4a7-4c9b-9e24-03ac7febfd6c.png">

<img width="691" alt="image" src="https://user-images.githubusercontent.com/78966839/198369278-d65a1a2a-5689-4b1b-8c9c-536affa26fcf.png">
<img width="789" alt="image" src="https://user-images.githubusercontent.com/78966839/198372545-de4c006a-cca6-436a-a54c-cf412170f3a4.png">

```
public class SubArray {
    public static void sub_array(int number[]) {
        for (int i = 0; i < number.length; i++) { // start
            int start = i;
            for (int j = i; j < number.length; j++) { // end (single element)
                int end = j;
                for (int k = start; k <= end; k++) { // print
                    System.out.print(number[k] + " "); // subarray
                }
                System.out.println();

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        sub_array(number);

    }
}
```

<img width="461" alt="image" src="https://user-images.githubusercontent.com/78966839/198374339-191537d9-efa1-437d-b346-691aa6263d59.png">

---
#  Broute forse apptoch of max subarray

<img width="732" alt="image" src="https://user-images.githubusercontent.com/78966839/198505868-ef97925d-d5a0-42d5-a430-d443bca752f2.png">

<img width="636" alt="image" src="https://user-images.githubusercontent.com/78966839/198508108-60c8a497-b398-4f6f-99f3-837a8bf72e7c.png">


```
public class MaxSubArrayBrotFource {
    // Broute forse apptoch of max subarray
    public static void max_Subarray(int number[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {// print
                    // subarray sum
                    currsum += number[k];
                }
                System.out.print(currsum + ",");
                if (maxSum < currsum) {
                    maxSum = currsum;
                }

            }

        }
        System.out.println("max sum is " + maxSum);

    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        max_Subarray(number);

    }
}
```

- **time comp is bad n3**
<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/198507553-113d1453-b2d4-49ed-8d3c-6c4d9b83d6ef.png">
---

# Max Subarray sum (PREFIX ARRAY)

- **new array**
- **ith element of sum**

<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/198590319-09076ad8-7357-47db-91fe-afd9c238632c.png">

<img width="699" alt="image" src="https://user-images.githubusercontent.com/78966839/198597547-4529970f-9a01-4e84-b486-6fd66cde6541.png">

<img width="715" alt="image" src="https://user-images.githubusercontent.com/78966839/198598669-b70a0bd2-fb17-497b-9e49-27561bc736d4.png">

```
public class SubArrayPreFixArr {
    public static void Prifix_subArray(int number[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE; // -infiniti
        // create prifix array
        int prifix[] = new int[number.length];
        prifix[0] = number[0]; // copy
        // calculate prifix array
        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i - 1] + number[i]; // Privious sum + current sum
        }
        for (int i = 0; i < number.length; i++) {

            for (int j = i; j < number.length; j++) {
                currsum = i == 0 ? prifix[j] : prifix[j] - prifix[i - 1];
            }
            if (maxSum <= currsum) {
                maxSum = currsum;
            }

        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int number[] = { 1, -2, 6, -1, 3 };
        Prifix_subArray(number);
    }
}
```
#### Time and spance comp
- **In Prifix array TC is 0(n2)**
<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/198640890-503f4f84-e201-4ee5-8a09-687fa40ee849.png">

---
# Kadane's

- in an array their is small +ve  +  Big -ve value add and final value is -ve **consider that in 0**.
- Only add if the num is +ve.
- **-ve = 0**

<img width="771" alt="image" src="https://user-images.githubusercontent.com/78966839/198683029-22233aa7-f77b-48ec-a73d-4fa25ad00f3c.png">

<img width="841" alt="image" src="https://user-images.githubusercontent.com/78966839/198684822-c8e3d6a9-6fbb-4e7e-8121-7611a1903214.png">

```
public class KadanesSubarray {
    public static void kadanes(int number[]) {
        int cs = 0;
        int ms = 0;
        for (int i = 1; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray is : " + ms);
    }

    public static void main(String[] args) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(number);

    }
}
// Tc o(n)
```

- **T.c o(n) good**
<img width="709" alt="image" src="https://user-images.githubusercontent.com/78966839/198690771-d168b5b2-12d6-459f-8a69-d4ed5e4316cc.png">

---
# Trap rain water
- Width of each bar is 1.

<img width="716" alt="image" src="https://user-images.githubusercontent.com/78966839/198834799-290db7f6-3b8a-4cf9-b95b-a4301464507e.png">

- Thinking approch
<img width="752" alt="image" src="https://user-images.githubusercontent.com/78966839/198835052-53dc6369-71c5-4bc2-b286-bd669c044fd7.png">

<img width="817" alt="image" src="https://user-images.githubusercontent.com/78966839/198835345-24d3a223-a6fc-4b3e-a9ca-c920a0edba3d.png">

### How to calculate water level?
- consider some point
- **min no of bar >2**

<img width="788" alt="image" src="https://user-images.githubusercontent.com/78966839/198836108-9d2914de-44f2-42f0-845d-881b7f61eea1.png">

- **Ascinding/des no water is trap**

<img width="475" alt="image" src="https://user-images.githubusercontent.com/78966839/198836197-9e1d8e5c-7b82-4efe-bf0a-62476af4783f.png">

- **min of (max left, mex right)**
<img width="854" alt="image" src="https://user-images.githubusercontent.com/78966839/198836520-584977d1-079c-4d5d-ba60-e578de20302e.png">

- **Code logic**

<img width="786" alt="image" src="https://user-images.githubusercontent.com/78966839/198836810-ccf53475-e7e7-4755-b879-721e0ae2720a.png">

#### How to calculate maxleft boundary, maxRight Boundary

- **Auxiliary array:- Helper array**

- **Left Max**

<img width="824" alt="image" src="https://user-images.githubusercontent.com/78966839/198837213-3034d931-0d66-4560-8cf9-5601b68d43dc.png">

- **Right max**
<img width="871" alt="image" src="https://user-images.githubusercontent.com/78966839/198837316-3e17bd0d-5efb-4f78-81ca-41afe02faafd.png">

- **For each bar we have to do**

<img width="857" alt="image" src="https://user-images.githubusercontent.com/78966839/198837371-562bda59-3dcb-4b12-a329-1a75cee80111.png">

# Trap rain water Code

- TC :- 0(n)

```
public class TrappingRainWater {
    public static int trap_Water(int height[]) {
        int n = height.length;
        // Calculate left max boundary - array
        int leftmax[] = new int[n];// left max size is equal to height
        leftmax[0] = height[0];

        for (int i = 1; i < n; i++) { // calculate start
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
            // current height compair to leftMax[i-1]
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];

        rightMax[n - 1] = height[n - 1]; // claculate from last so height.length-1

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
            // i+1 becouse stating from last , compair to right max i + 1
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound, right max bound)
            int waterLevel = Math.min(leftmax[i], rightMax[i]);
            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("Trap water capt inside bar " + trap_Water(height));

    }

}

// H.W := 1.Dry run,2. wtite code 5 tme
```

---
# Buy & Sell Stocks (T.c 0(n))

- 2 variable , Buyrate = +inf; maxProfix =0
- loop 0 to n
- case 1 :- Buyrate < price[i]
- int profid = price[i] - buyratel
- maxProfix = max(maxProfid,profid)
- case 2
- Buyrate = price[i]

<img width="727" alt="image" src="https://user-images.githubusercontent.com/78966839/199320346-b180c875-4f64-47f4-a07b-4ce5716b6655.png">

<img width="747" alt="image" src="https://user-images.githubusercontent.com/78966839/199320647-4915d193-7c5c-4b90-ad67-3c29761f45fe.png">

- maxPeice
<img width="795" alt="image" src="https://user-images.githubusercontent.com/78966839/199321130-0f58e79d-b859-4f17-a216-c428cf09cb1c.png">

<img width="782" alt="image" src="https://user-images.githubusercontent.com/78966839/199321744-40c825c2-97ba-4e18-aba8-d8109852c30c.png">


```
public class BuyAsellStock {
    public static int buyStuck(int price[]) {
        // profit = buyPrice - shel price
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) { // profit
                int profit = price[i] - buyPrice; // today's profit
                maxProfit = Math.max(maxProfit, profit);
                // mix(golbal-profit,to day profit)
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyStuck(prices));

    }
}

// 2 variable , Buyrate = +inf; maxProfix =0
// loop 0 to n
// case 1 :- Buyrate < price[i]
// int profid = price[i] - buyratel
// maxProfix = max(maxProfid,profid)
// case 2
// Buyrate = price[i]
```
# Array Assigment

<img width="354" alt="image" src="https://user-images.githubusercontent.com/78966839/199476620-8315f897-48b5-43a0-a785-c6e254e7e1c9.png">
<img width="368" alt="image" src="https://user-images.githubusercontent.com/78966839/199476757-a707034d-e2be-4790-b85b-554ea79be339.png">
<img width="342" alt="image" src="https://user-images.githubusercontent.com/78966839/199477033-8db82671-4efa-44c9-9ff8-100e488285c2.png">
<img width="354" alt="image" src="https://user-images.githubusercontent.com/78966839/199477134-fe401dc0-30d4-4bd0-9ac9-e58c79bcd489.png">

---
# Array Solution
<img width="389" alt="image" src="https://user-images.githubusercontent.com/78966839/199477747-eef3e3f1-6518-4558-a9db-1e622d19280b.png">
<img width="367" alt="image" src="https://user-images.githubusercontent.com/78966839/199477888-ae21a638-6759-4e57-bde7-048ba71c39ba.png">
<img width="391" alt="image" src="https://user-images.githubusercontent.com/78966839/199477981-2d461569-ceed-4d95-a04e-a8fba924bd60.png">
<img width="397" alt="image" src="https://user-images.githubusercontent.com/78966839/199478112-d4de5ea8-94c2-42c4-a8a4-37c2b46c9031.png">
<img width="387" alt="image" src="https://user-images.githubusercontent.com/78966839/199478224-3e9c311c-70d5-4864-b66f-13ec4761acac.png">
<img width="388" alt="image" src="https://user-images.githubusercontent.com/78966839/199478304-2f24e7ad-8d69-4a3d-a6ac-8e2bab144314.png">





