# Hear i solve the advance patten problem

- matrix
<img width="866" alt="image" src="https://user-images.githubusercontent.com/78966839/197444403-8cea5e45-2617-4d67-9515-ef6c3db74fac.png">

<img width="859" alt="image" src="https://user-images.githubusercontent.com/78966839/197444705-e6b1d24f-407d-49cd-9b77-b48bf06c4737.png">

```
public class hollow_rectangle {
    // Print Holo_rectangle pattren
    public static void Holow_rectangle(int row, int col) {
        // Outer loop
        for (int i = 1; i <= row; i++) {
            // inner - colums
            for (int j = 1; j <= col; j++) {
                // cell = (i,j)
                if (i == 1 || i == row || j == 1 || j == col) {
                    // Boundry condiction
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Holow_rectangle(4, 5);

    }

}
```

# Dry run

<img width="826" alt="image" src="https://user-images.githubusercontent.com/78966839/197450792-a44e2093-b493-4211-a672-589a3b007998.png">

<img width="822" alt="image" src="https://user-images.githubusercontent.com/78966839/197450850-93b82843-c20b-4184-b612-a971e7231ed7.png">

---
# Inverted roted half pryamid

<img width="727" alt="image" src="https://user-images.githubusercontent.com/78966839/197460024-2b70f5ec-2ca8-47a5-8309-ac1a98c21ac2.png">

<img width="715" alt="image" src="https://user-images.githubusercontent.com/78966839/197460456-894a0806-adee-4360-b12f-b0d8e36f6bfb.png">

```
public class HalfpyramidInverted {
    // Print Inverted half Pyramd
    public static void inverted_half_Pyramid(int n) {
        // Outer
        for (int i = 1; i <= n; i++) {// row
            // space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Starts
            for (int j = 1; j <= i; j++) { // 1row 1star ...
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_Pyramid(4);
    }

}
// matrix
// space & star
// logic How meney star and space
// space = n-row
// stars = 1row 1 star...
// new line
```
- **Dry run in copy**

---
# Inverted Half-pyramid with Number
<img width="737" alt="image" src="https://user-images.githubusercontent.com/78966839/197515785-aa22c0f8-009b-4f98-9d10-74e27e32d7f6.png">


```
public class HalfpyramidNumber {
    public static void Half_pyramid_number(int n) {
        // outer-loop
        for (int i = 1; i <= n; i++) {
            // Inner-loop (col)
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();// New line
        }
    }

    public static void main(String[] args) {
        Half_pyramid_number(5);

    }
}
```
- **Dry run in copy**
---
# FLOYD'S TRANGLE 
- counter ++;

<img width="840" alt="image" src="https://user-images.githubusercontent.com/78966839/197522968-87c91964-6455-4bc7-88fa-610ad1156553.png">

```
public class floyd_trang {
    public static void floyds_trangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) { // Outer loop row
            for (int j = 1; j <= i; j++) {// Inner loop -col, How meney time will count be printed
                System.out.print(counter + " ");
                counter++; // every iterate count increase
            }
            System.out.println(); // New line
        }
    }

    public static void main(String[] args) {
        floyds_trangle(5);

    }
}
```
- **Dry run in copy**
---

# o_1 Trangle
<img width="724" alt="image" src="https://user-images.githubusercontent.com/78966839/197579302-ea07a4c4-9a69-4e3e-b2fa-2cb6f163c59f.png">

<img width="736" alt="image" src="https://user-images.githubusercontent.com/78966839/197580849-9a337821-f428-454a-a01c-e358b180453f.png">

```
public class Trangle_0_1 {
    public static void zero_one_trangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {// inner col j
                // cell-no (i+j)
                if ((i + j) % 2 == 0) {// even 1
                    System.out.print("1 ");
                } else {
                    System.out.print("0 "); // odd 0
                }
            }
            System.out.println();// Next line
        }
    }

    public static void main(String[] args) {
        zero_one_trangle(5);

    }
}
```
---
# BUTTERFLY PATTERN
- Break the pattren, It is a mirror image
- 

<img width="805" alt="image" src="https://user-images.githubusercontent.com/78966839/197785297-1f8b31e9-b5ee-46fb-b302-599b288f779a.png">

<img width="773" alt="image" src="https://user-images.githubusercontent.com/78966839/197785579-636df266-b83c-4349-a7c7-899a292a3b65.png">

<img width="803" alt="image" src="https://user-images.githubusercontent.com/78966839/197786253-e2ec286c-99e2-43c1-a838-c84774f3aca3.png">

<img width="738" alt="image" src="https://user-images.githubusercontent.com/78966839/197790886-514476b9-8c17-46c6-9777-d450fc8ca3ec.png">

```

public class ButterFly {
    public static void Butter_fly(int n) {
        // 1st-half
        for (int i = 1; i <= n; i++) {// Outer
            // star-j
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space -2 * (n - i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half
        for (int i = n; i >= 1; i--) {
            // star-i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space -2 * (n - i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        Butter_fly(4);
    }

}
```

# Solid RumBus
<img width="724" alt="image" src="https://user-images.githubusercontent.com/78966839/197750936-48403b50-e3ec-499a-a687-dc72158b37c2.png">

```
public class Solidrhumbus {
    public static void solid_rhomBus(int n) {
        // Outer
        for (int i = 1; i <= n; i++) {
            // space col (n - i)
            for (int j = 1; j <= (n - i); j++) { // Inner
                System.out.print(" ");
            }
            // Star
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solid_rhomBus(5);
    }
}
```
## Holo Rhumbus pattren
<img width="717" alt="image" src="https://user-images.githubusercontent.com/78966839/197759160-d752a35f-bf41-4f27-8726-aecdda9fdf67.png">

```
public class HoloRhumbus {
    public static void holp_rhumbush(int n) {
        for (int i = 1; i <= n; i++) {
            // space (n-i)
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Star Holo rhumbush logic- star
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        holp_rhumbush(5);

    }

}
```
---
# Dimand Pttren

<img width="745" alt="image" src="https://user-images.githubusercontent.com/78966839/197779270-80aa089f-cec7-4ccd-b46b-646e184caaf9.png">

```
public class Dimand {
    public static void dimand_pattren(int n) {
        // 1-half
        for (int i = 1; i <= n; i++) { // 1 to n
            // space (n-1)
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // 2 * (i + 1) Odd Number
            for (int j = n; j <= 2 * (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2=half
        for (int i = n; i >= 1; i--) {// n to 1
            // space (n-1)
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // start Odd Number 2*(i+1)
            for (int j = n; j <= 2 * (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        dimand_pattren(4);

    }
}
```
---
# NUMBER PYRAMID

<img width="605" alt="image" src="https://user-images.githubusercontent.com/78966839/197793807-b649e8ff-f40c-46f8-a0e5-70a4392f66b3.png">

<img width="600" alt="image" src="https://user-images.githubusercontent.com/78966839/197795453-87d892dd-17f6-4ba5-8215-96b1903f2190.png">

```
public class Numberpyramid {
    public static void number_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Space (n-i)
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Number i
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        number_pyramid(5);

    }
}

```
---
# PALINDROMIC PATTREN WITH NUMBER

- **PALINDROM WORD**
<img width="716" alt="image" src="https://user-images.githubusercontent.com/78966839/197818426-114a74e0-5fb3-4b7c-9976-21620712c8d4.png">


<img width="746" alt="image" src="https://user-images.githubusercontent.com/78966839/197819790-203d0a56-e450-4b16-bbce-3d035cc91b92.png">

<img width="731" alt="image" src="https://user-images.githubusercontent.com/78966839/197821484-5931008b-349e-4b09-8a84-e0722fe00028.png">

```
public class palandromicNumber {
    public static void PalanDromic_Number(int n) {
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // decending
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // accending
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        PalanDromic_Number(5);

    }
}
```

## DRY RUN
<img width="673" alt="image" src="https://user-images.githubusercontent.com/78966839/197832413-9baff0b6-bb25-4e7a-a1f3-7d7365b32e52.png">

