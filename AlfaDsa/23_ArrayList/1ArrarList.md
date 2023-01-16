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













