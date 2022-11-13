# Object oriented oriented Programming

# Object
- **entities in the real world**
- ex:- Pan, car,animal
<img width="680" alt="image" src="https://user-images.githubusercontent.com/78966839/201482824-2c67560b-3777-49dd-8a5a-3ac3ad528e02.png">

# Class
- **Group of these entities**
- collection of object

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
# The oops has 4 piller
- **Encapulation**
- **Inheritance**
- **Abstraction**
- **Polymorphism**

<img width="706" alt="image" src="https://user-images.githubusercontent.com/78966839/201531089-8d78150e-755d-4ef4-8af7-a1798210da3b.png">

# Encapulation
-  Encapsulation is defined as the **Wrappping of data & methods under a single unit**
- It is also know as **data hidding**

<img width="731" alt="image" src="https://user-images.githubusercontent.com/78966839/201531293-92146c1c-440e-4118-a54e-726c13e3f918.png">

# Constructores :-

<img width="720" alt="image" src="https://user-images.githubusercontent.com/78966839/201532385-1632621b-c6ab-4806-9366-831322f5b0b6.png">

```
public class conStrUnter {
    public static void main(String[] args) {
        Student s1 = new Student("Om");
        System.out.println(s1.name); // Om
    }
}

class Student { // create class
    String name; // Property
    int roll;

    Student(String name) {
        this.name = name;
    }
}
```
# Type of Constructure
<img width="748" alt="image" src="https://user-images.githubusercontent.com/78966839/201533499-2eca8df4-6ab7-47c5-afba-762b2f0528bc.png">



## Parameter
```
 Student(String name) {
        this.name = name;
    }
```

## non-Parameter

```
Student() {
        System.out.println("constructure is colling...");
    }
```

## Copy constructure
- Copy constructure in java created by user.
- Transfor all property of object toanother object.

<img width="371" alt="image" src="https://user-images.githubusercontent.com/78966839/201536423-29d6b01f-9bd4-480b-b391-86443384cb99.png">

```
 // copy constructure
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }
```
- array referance copy.

<img width="433" alt="image" src="https://user-images.githubusercontent.com/78966839/201537352-5585b763-9b32-48e2-9458-38e7c44efc07.png">

### All type of constructore

```
public class conStrUnter {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Om prakash";
        s1.roll = 12;
        s1.password = "abce";

        s1.marks[0] = 100;
        s1.marks[1] = 50;
        s1.marks[2] = 90;

        Student s2 = new Student(s1); // s2 copy in s1
        s2.password = "xyz";

        // Print s2 mark
        for (int i = 0; i < 3; i++) {
            s1.marks[1] = 70;
            System.out.println(s2.marks[i]);
            // Pirnt all value of s1,Becouse it is a copy constructer
        }

    }
}

class Student { // create class
    String name; // Property
    int roll;
    String password;
    int marks[];

    // copy constructure
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    // Non-Parameter
    Student() {
        marks = new int[3];
        System.out.println("constructure is colling...");
    }

    // Parameter constructure
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
```

# Shallow & deep copy
- **Shallow** :- Shallow refrance copy
- change  reflact

- **Deep copy** :- new array created
- change don't reflact

<img width="718" alt="image" src="https://user-images.githubusercontent.com/78966839/201537871-af3afcee-867b-4a1c-aeb9-e3a2b7425e0c.png">

# Destructore
- **Java dont have a Destructore, it's have a Garbage collacter**
- Garbage collacter :- It automatically delete the unuse value.

<img width="726" alt="image" src="https://user-images.githubusercontent.com/78966839/201538414-4c807111-69eb-4a98-a54e-db7eda5e3fcb.png">

# Inheritance

## What is inheritance in Java?
- Inheritance in Java is a concept that **acquires the properties from one class to other classes.**
- for example, the relationship between father and son. Inheritance in Java is a process of acquiring all the behaviours of a parent object.

<img width="577" alt="image" src="https://user-images.githubusercontent.com/78966839/201538903-88fb95eb-3953-420f-81ee-a466b8a34daf.png">

<img width="525" alt="image" src="https://user-images.githubusercontent.com/78966839/201539224-6a232103-3c44-4e3a-9fd3-a53e97ee1790.png">

- **extends Key word inherate from the Parent class**

```
public class Inhr {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base class / Parent
class Animal {
    String color;

    void eat() {
        System.out.println("eat");
    }

    void breath() {
        System.out.println("Breath");
    }

}

// Derive class / child
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swim in watert");
    }
}
```
# Single level Inheritence

- **a class inherits the properties from a single class.**

<img width="353" alt="image" src="https://user-images.githubusercontent.com/78966839/201540057-fbfe90f9-1b2f-4c0b-a87f-9e65e35ea3f6.png">
















