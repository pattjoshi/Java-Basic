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

## Sorting an arrayList

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









