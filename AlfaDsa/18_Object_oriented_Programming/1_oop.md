# Object oriented oriented Programming

# Object
- **entities in the real world**
- ex:- Pan, car,animal
<img width="680" alt="image" src="https://user-images.githubusercontent.com/78966839/201482824-2c67560b-3777-49dd-8a5a-3ac3ad528e02.png">

# Class
- **Group of these entities**
- collection of boject

<img width="706" alt="image" src="https://user-images.githubusercontent.com/78966839/201483084-6c8c914e-fbef-4a2d-a54c-af8215a68dbb.png">

<img width="368" alt="image" src="https://user-images.githubusercontent.com/78966839/201483694-21527151-025f-4634-8c3d-5f1b89b82a9a.png">


## Classes and Object
<img width="727" alt="image" src="https://user-images.githubusercontent.com/78966839/201484094-0c3c46c8-9c9c-4ff6-bc47-10899d538682.png">

- Object are created in heap.
- **new key word created Space in heap**
<img width="308" alt="image" src="https://user-images.githubusercontent.com/78966839/201485313-e73468f0-511e-4013-990a-55f78db76821.png">

- **access the object of a function we use (.) Operater.**

```
public class Oop {
    public static void main(String[] args) {
        Pan p1 = new Pan(); // created a pan object called p1
        p1.setColor("bule"); // set value
        System.out.println(p1.color); // access the object of a function we use (.) Operater
        p1.tip = 2; // Direct call
        System.out.println(p1.tip);
    }
}

class Pan { // Blue-Print
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newtip) {
        tip = newtip;
    }
}
```
# Access Modifiers

<img width="715" alt="image" src="https://user-images.githubusercontent.com/78966839/201486376-b8543b84-055e-4d72-849b-af0d869a1186.png">

```
public class Accmod {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Om prakash";
        myAcc.setPassWord("om0,,9");

    }
}

class BankAccount {
    public String userName;
    private String password;

    public void setPassWord(String pws) {
        pws = password;
    }
}
```
# Gettet & setters

<img width="741" alt="image" src="https://user-images.githubusercontent.com/78966839/201489765-df37106a-42db-4e71-a443-870f22b88686.png">

```
public class GatterSetter {

    public static void main(String[] args) {
        Pan p1 = new Pan(); // created a pan object called p1
        p1.setColor("bule"); // set value
        System.out.println(p1.getColor());
        p1.setTip(3);
        System.out.println(p1.getTip());
    }

}

class Pan { // Blue-Print
    private String color; // Private property not access
    private int tip;

    // Getter :- to return the value
    String getColor() {
        return this.color; // this refer to the current object
    }

    int getTip() {
        return this.tip;
    }

    // Seter :- to modify the value
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newtip) {
        tip = newtip;
    }
}
```

















