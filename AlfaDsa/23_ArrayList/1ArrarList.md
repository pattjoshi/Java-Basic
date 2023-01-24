# Array List

- In java Array List is Build Data Structure.
- Data Store in Linear Structure.
- Linear means Line by line

<img width="631" alt="image" src="https://user-images.githubusercontent.com/78966839/212734310-fe07ded0-ba5c-4cd7-a853-8508a35c6691.png">

<img width="711" alt="image" src="https://user-images.githubusercontent.com/78966839/212734398-8de38144-0164-4586-b13d-474c0d3edc87.png">


# Operaction on Array List

<img width="708" alt="image" src="https://user-images.githubusercontent.com/78966839/212733119-09b1b96d-466e-41dc-a3df-06157e41e051.png">

## Code

```
import java.util.ArrayList;

public class Array_List_Declare {
    public static void main(String[] args) {
        // In java classes name with upercase
        ArrayList<Integer> list = new ArrayList<>();
        // String
        ArrayList<String> list2 = new ArrayList<>();
        // Float
        ArrayList<Float> list3 = new ArrayList<>();

        // Ek element ko list me add karne me o(n) t.c lagta he
        list.add(1); // o(1)
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(8);
        System.out.println("Show all array list " + list);

        // Get Element
        // int element = list.get(2);
        // System.out.println("Get elemet in " + element);

        // Remove Element
        // list.remove(2);

        // Set element
        // list.set(3, 99);

        // contains Elemtnt
        System.out.println(list.contains(99)); // False
        System.out.println(list.contains(2)); // True

        System.out.println(list);

    }
}
```


# Size of Array List

- .size is a Method which return the size of arrayList

<img width="260" alt="image" src="https://user-images.githubusercontent.com/78966839/212736522-3e5f1fa0-df6f-4772-8431-7f5b48b4705b.png">

```
import java.util.ArrayList;

public class Array_List_Declare {
    public static void main(String[] args) {
        // In java classes name with upercase
        ArrayList<Integer> list = new ArrayList<>();
        // String
        ArrayList<String> list2 = new ArrayList<>();
        // Float
        ArrayList<Float> list3 = new ArrayList<>();

        // Ek element ko list me add karne me o(n) t.c lagta he
        list.add(1); // o(1)
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(8);

        // .size is a Method which return the size of arrayList
        System.out.println(list.size()); // 7

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
```


# Reverse of ArrayList

<img width="506" alt="image" src="https://user-images.githubusercontent.com/78966839/212740485-5264f083-bc00-4a33-82b5-22d4bd0b1de1.png">


```
import java.util.ArrayList;;

public class ReversePrint {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Print reverse o(n)
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(2);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
```

# Find Maximum
<img width="590" alt="image" src="https://user-images.githubusercontent.com/78966839/212741086-c7352c7e-fa3a-4983-8333-6c854e83b7cb.png">


```
import java.util.ArrayList;;

public class Find_minimum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(6);
        // Fint Maximum of arrayList
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

        }
        System.out.println("Max Number is " + max);
    }
}
```

# Swap 2 Number

<img width="711" alt="image" src="https://user-images.githubusercontent.com/78966839/213864372-8572327f-9b47-42ae-bad6-65bb1372b7fe.png">

```

import java.util.ArrayList;

public class Swap2Num {
    public static void Swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, idx2);
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Before Swap" + list);

        int idx1 = 1, idx2 = 3;
        Swap(list, idx1, idx2);
        System.out.println("Arter Swap" + list);

    }
}
```

# Sorting an arrayList

<img width="658" alt="image" src="https://user-images.githubusercontent.com/78966839/213864566-cb943c48-f1b5-41aa-aa30-27c19e438baf.png">

- Collections.sort :- Sort in assending order Default
- Inbuild method
- class :- Collactions
- Interface :- Collaction

```

import java.util.ArrayList;
import java.util.Collections;;

public class Sorting_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lsit = new ArrayList<>();
        lsit.add(2);
        lsit.add(42);
        lsit.add(88);
        lsit.add(22);
        lsit.add(12);

        System.out.println("Before swap " + lsit);
        Collections.sort(lsit);
        System.out.println("Before swap " + lsit);
        // Decending
        Collections.sort(lsit, Collections.reverseOrder());
        // Compariter -> logic defind
        System.out.println("Decending order " + lsit);

    }
}
// Collections.sort :- Sort in assending order Default
// Inbuild method
// class :- Collactions
// Interface :- Collaction
```

# Implementation ArrayList

<img width="667" alt="image" src="https://user-images.githubusercontent.com/78966839/213865112-20ec9b9e-2dfb-4a2e-94f7-035a6163b087.png">

- Array List impliment Like an array.
- it an array defind some loginc

<img width="667" alt="image" src="https://user-images.githubusercontent.com/78966839/213865138-14518640-f6fa-40f6-810e-76d44c09b29e.png">

- Initialy create an fix size array
- List access this array and return the value

<img width="707" alt="image" src="https://user-images.githubusercontent.com/78966839/213866752-3c1a7c74-58ff-429b-9556-09b1eec35680.png">

- Java create intrnaly 2X size of this array. and copy that element in to new array. Old memory is deleted.

# Multi-dimension ArrayList

<img width="711" alt="image" src="https://user-images.githubusercontent.com/78966839/213867358-751c20ec-7462-41ba-a08e-785daadaddb5.png">

## Code Ans

```
import java.util.ArrayList;

public class MultiDeminShionArrayList {
    public static void main(String[] args) {
        // 2D array
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            List.add(i * 1);
            List2.add(i * 2);
            List3.add(i * 3);
        }
        mainList.add(List);
        mainList.add(List2);
        mainList.add(List3);

        System.out.println(mainList);

        // Nested Loops
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
```

## O/p

```
[[1, 2, 3, 4], [2, 4, 6, 8], [3, 6, 9, 12]]
1 2 3 4 
2 4 6 8
3 6 9 12
```


### Print 2D arrayList 

```
import java.util.ArrayList;

public class MultiDeminShionArrayList {
    public static void main(String[] args) {
        // 2D array
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        mainList.add(List);

        ArrayList<Integer> List2 = new ArrayList<>();
        List2.add(3);
        List2.add(4);
        mainList.add(List2);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> current = mainList.get(i);
            for (int j = 0; j < current.size(); j++) {
                System.out.print(current.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
```
## O/p

```
1 2
3 4
[[1, 2], [3, 4]]
```

## Container with most water

<img width="763" alt="image" src="https://user-images.githubusercontent.com/78966839/213876572-d2a89da9-58ba-46d0-aa32-86fd28c3e138.png">

<img width="757" alt="image" src="https://user-images.githubusercontent.com/78966839/213877006-826dd8d3-22d8-4bec-8ac5-a9ec62352a67.png">

# Brote force Approch

- Possible pair find.

<img width="785" alt="image" src="https://user-images.githubusercontent.com/78966839/213877393-aabed0de-b628-48d5-a52f-93d772aa90d1.png">


```
import java.util.ArrayList;

public class ContainMWBroteFor { // o(n^2)
    // Borte force approch of Contain max water
    public static int StoreWater(ArrayList<Integer> height) {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {// 1st row
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);

        System.out.println("Contain with most water is " + StoreWater(hight));
    }
}
```

# Container with most water 2 Pointer Approch

- Takea a 2 variable Lp,Rp 
- find current water

<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/213902067-6b15776f-0e88-4e1e-8ccf-47983ab62bb6.png">



<img width="532" alt="image" src="https://user-images.githubusercontent.com/78966839/213902156-a594e5cf-f684-4d53-b9ff-151496b173e2.png">

## Logic

<img width="710" alt="image" src="https://user-images.githubusercontent.com/78966839/213902248-b7f320ed-373f-41e0-a1b6-69410d7dbdf7.png">

- I have to use 2 Pointer,Set that at end.
- calculate some work. Ex:- currWater ,Ht, width
- Condiction check .
- Loop run n time
- Move Small Line 

## Code  o(n)

```
import java.util.ArrayList;

public class CountMaxWOPt {

    // 2 Pointer Apperoch
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // Calculate
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // Update
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));

    }
}

```

# How is this different then **Trapping Rainwater**

<img width="680" alt="image" src="https://user-images.githubusercontent.com/78966839/213903705-80d2cccb-9fbf-4904-a741-ad54fd866231.png">

# pair sum 

<img width="710" alt="image" src="https://user-images.githubusercontent.com/78966839/214090435-12e1743e-4fa8-48c6-a7b1-4d84eaac290c.png">

### Brote force
```
import java.util.ArrayList;

public class PairSum {

    public static boolean sumPair(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int targrt = 5;
        System.out.println(sumPair(list, targrt));

    }
}
```

#### o/p 

```
true
```

# 2 Pointer approch o(n)

<img width="725" alt="image" src="https://user-images.githubusercontent.com/78966839/214097341-70b4f37c-b8a4-466e-a96b-84cf33ad6cf0.png">

### Example

#### case 2
- if combine sum is Less then target value then go for larger value (Lp++)

<img width="297" alt="image" src="https://user-images.githubusercontent.com/78966839/214099393-2d77dee9-d1f6-4c79-9358-9298899aa4fb.png">

#### case 3

<img width="333" alt="image" src="https://user-images.githubusercontent.com/78966839/214101997-50ef573c-576c-4b2e-9aa0-61c458bffbdb.png">

### Logic

<img width="366" alt="image" src="https://user-images.githubusercontent.com/78966839/214102453-e918c17d-fbe9-40e5-9074-5052290108f8.png">

### Code

```
import java.util.ArrayList;

public class PairSum {

    public static boolean sumPair(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else if (list.get(lp) + list.get(rp) > target) {
                rp--;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1 2 3 4 5 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int targrt = 5;
        System.out.println(sumPair(list, targrt));

    }
}
```
# pair sum 2

<img width="547" alt="image" src="https://user-images.githubusercontent.com/78966839/214108892-022b2e57-960d-4a15-b9ee-727197fda0a4.png">

- 15 is Pivit point (beaking ) 

<img width="740" alt="image" src="https://user-images.githubusercontent.com/78966839/214109469-78bf23d9-52de-46d7-8c64-d88e321ab782.png">

- lp = Small 
- rp = large
- Rotated increment using Moduler arithmetic operater

<img width="755" alt="image" src="https://user-images.githubusercontent.com/78966839/214111324-78091d49-9e3a-45f9-ba57-acd421cb4fb0.png">

### Dry run 

- Step 1 :- find pivet 
- pivet in i = 1;
- lp = i+1 = 2 **(Initialy)**
- rp = 1 **(Initialy)**

<img width="765" alt="image" src="https://user-images.githubusercontent.com/78966839/214114255-9000559d-e1d1-41d5-9b58-36fcd4a4c321.png">

## Code o(n)


```

import java.util.ArrayList;

public class PairSum2 {
    public static boolean PrintSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(i + 1)) { // Break poing
                bp = 1;
                break;
            }
        }
        int lp = bp + 1; // Smallest
        int rp = bp; // largest element
        while (lp != rp) {
            // Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            // case 3
            else if (list.get(lp) + list.get(rp) > target) {
                rp = (n + rp - 1) % n;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11,15,6,8,9,10 target
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 17;
        System.out.println(PrintSum2(list, target));
    }
}
```

# Array List qus

<img width="364" alt="image" src="https://user-images.githubusercontent.com/78966839/214287452-f1899da6-c9ec-4b07-a696-bfcf911347bf.png">

<img width="359" alt="image" src="https://user-images.githubusercontent.com/78966839/214287534-518dfec9-1da5-4851-8e08-acf454dc8b5d.png">

<img width="350" alt="image" src="https://user-images.githubusercontent.com/78966839/214287494-5f74fa33-f5ff-4037-a98f-f63a78064b7d.png">


# Array list Solution

<img width="362" alt="image" src="https://user-images.githubusercontent.com/78966839/214287185-10cf921d-5a4c-4972-b85d-a020b55a319a.png">

<img width="352" alt="image" src="https://user-images.githubusercontent.com/78966839/214287236-9ea38e8d-66ff-4098-968c-f1a6dbb3899b.png">

<img width="346" alt="image" src="https://user-images.githubusercontent.com/78966839/214287287-a1401ca0-9e4a-45be-b0a0-0b1809d78628.png">

<img width="346" alt="image" src="https://user-images.githubusercontent.com/78966839/214287329-d1741a5f-1017-45c5-8dd1-5f46162623da.png">
































