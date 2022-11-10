# Bit_Manipulation

# Intruduction to Bit_Manipulation
- Computer understand only 2 degite 0 and 1
- Binayr means 2

<img width="678" alt="image" src="https://user-images.githubusercontent.com/78966839/200877845-cf14f63d-a163-46a8-b8ee-d567eaa3febb.png">

# Binary number System

## Decomal to Binary

<img width="390" alt="image" src="https://user-images.githubusercontent.com/78966839/200885425-1b331af4-b740-4c4d-9a2d-e40d625dd141.png">

# Binary to decimal

<img width="305" alt="image" src="https://user-images.githubusercontent.com/78966839/200885769-febad808-d154-4ecb-ba92-dff2afd2e17e.png">

<img width="695" alt="image" src="https://user-images.githubusercontent.com/78966839/200886921-7377bbf3-c93e-4e51-88b5-072d7b84a99a.png">

# Bit wise operater 

<img width="516" alt="image" src="https://user-images.githubusercontent.com/78966839/200887926-50629f7e-f7fa-463e-aa7c-6142f9485d5a.png">

# Binary AND &
- Both true the true
<img width="722" alt="image" src="https://user-images.githubusercontent.com/78966839/200957467-8bce43c2-5df0-480e-82ea-01591301d2e4.png">

```
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(5 & 6); // 4
    }
}
```

# Binary OR |
- one true rest true
<img width="743" alt="image" src="https://user-images.githubusercontent.com/78966839/200958962-82e80e04-a407-494a-a49a-931db45cccc9.png">

```
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(5 | 6); // 7
    }
}
```
#  Binary XOR ^
- Only one true then true
<img width="738" alt="image" src="https://user-images.githubusercontent.com/78966839/200961478-29cc2ddd-0796-4ec2-ab87-c751f35ef0dd.png">

```
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(5 ^ 6); // 3
    }
}
```

# Binary one's complement
- Single bit operater
- **convert +ve to -ve Inverse**
- LSB :- Lest Significant Bit
- MSB :- Most Significent Bit

- MSB = 0 --> +Ve
- MSB = 1 --> -Ve

<img width="750" alt="image" src="https://user-images.githubusercontent.com/78966839/200966184-d92fcae4-020d-4763-9896-3f2a7bbc6d9f.png">

## 2's complitment

<img width="328" alt="image" src="https://user-images.githubusercontent.com/78966839/200967141-89cd7a62-5b95-4fbc-8435-e678ccfc7a0a.png">

<img width="309" alt="image" src="https://user-images.githubusercontent.com/78966839/200967252-f827eac0-064a-421d-be72-3dccfb3ca50e.png">

<img width="740" alt="image" src="https://user-images.githubusercontent.com/78966839/200967622-f8c51ef1-0858-40dd-8872-48069e35c972.png">

## ~0
<img width="222" alt="image" src="https://user-images.githubusercontent.com/78966839/200967833-075a2f67-df1e-4d45-ab7f-4137c1502ae8.png">

```
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(~0); // -1
    }
}
```

# Binary Left Shift <<

- **formula**
<img width="274" alt="image" src="https://user-images.githubusercontent.com/78966839/200970779-c3025f81-7c08-4875-8cc1-662c24bbfbf2.png">

<img width="422" alt="image" src="https://user-images.githubusercontent.com/78966839/200970846-cd0be30b-4fc4-41c7-b7d8-b2c88b2f2d9f.png">

# Binary Right shift >>
- Shift Right By n Index

<img width="421" alt="image" src="https://user-images.githubusercontent.com/78966839/200972019-5e653880-04cc-472c-bc40-8441c18b00a6.png">

<img width="646" alt="image" src="https://user-images.githubusercontent.com/78966839/200972121-605f1b56-1a32-4bc9-a238-a25dc276d417.png">

```
public class bitManipulation {
    public static void main(String[] args) {
        System.out.println(6 >> 1); // 3
    }
}
```
# Check of the number is Odd or even

<img width="723" alt="image" src="https://user-images.githubusercontent.com/78966839/200975055-dfa4146a-08ee-4d0b-985c-3b545fd34e78.png">


<img width="684" alt="image" src="https://user-images.githubusercontent.com/78966839/200975766-871526b8-02a8-448d-b07e-9f099445c15e.png">

- & both 1 then 1

```
public class OddEven {

    public static void oddeven(int num) {
        int butMask = 1;
        if ((num & butMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        oddeven(3); // Odd number
        oddeven(4); // Even Number
        oddeven(14); // Even Number
    }
}
```

# Get ith Bit

<img width="719" alt="image" src="https://user-images.githubusercontent.com/78966839/201076080-3cb00fc9-4e7c-4edc-9828-a845b88384f2.png">

<img width="510" alt="image" src="https://user-images.githubusercontent.com/78966839/201076694-f8f589a5-b10f-49fe-b139-56a963f7972c.png">

<img width="503" alt="image" src="https://user-images.githubusercontent.com/78966839/201076824-dd1ed5dc-b120-4a93-913b-cb188da6aeba.png">

### ex 10
<img width="221" alt="image" src="https://user-images.githubusercontent.com/78966839/201079555-96d32fa7-ce62-46ec-8699-e5073d715163.png">

```

public class getIth {
    // Get ith position (0,1)
    public static int getItH(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        System.out.println(getItH(10, 2));// 0

    }

}
```
# Set ith position
- **change to 1**
<img width="716" alt="image" src="https://user-images.githubusercontent.com/78966839/201117260-e84ae8d6-a0d1-46f4-948f-6c3aeab5d181.png">

```
public class Setith {

    public static int setitH(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setitH(10, 2));
    }
}
```
# Clear ith Bit
- **Change to 0**
<img width="715" alt="image" src="https://user-images.githubusercontent.com/78966839/201118183-f79af748-4524-4218-9129-0383e9bca9b8.png">


```
public class ClearIthBit {

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }
}
```
# Update ith bit

- if n = 0 Clear ith Bit
- if n == 1 set ith Bit

<img width="687" alt="image" src="https://user-images.githubusercontent.com/78966839/201175765-4de404fc-3c65-446b-9c57-cf845c4b6179.png">

```
public class updateIthBit {

    // clear Ith bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setitH(n, i);
        // }
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10, 2, 1)); // 14
    }
}
```












