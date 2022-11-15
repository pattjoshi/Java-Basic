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

# Multi Level Inheritence
- **includes the involvement of at least two or more than two classes**
<img width="482" alt="image" src="https://user-images.githubusercontent.com/78966839/201645137-949ba28f-2992-4fe9-a977-7a3e8deedc13.png">

```
public class Inhr {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.lags = 4;
        System.out.println(dobby.lags);
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

// Multi-level Inheritence

class Mammel extends Animal {
    int lags;
}

class Dog extends Mammel {
    String bread;
}
```
# Hierarchial Inheritence
- **Single Base class multiple Derive class**

<img width="744" alt="image" src="https://user-images.githubusercontent.com/78966839/201649325-b0d8e517-f51b-4479-949f-d599e1e31ac8.png">

```
public class Inhr {
    public static void main(String[] args) {
        Bard batak = new Bard();
        batak.walk();
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

// Hierarchial Inheritence
// Derived class
class Mammel extends Animal {
    void walk() {
        System.out.println("wakd");
    }
}

// Derived class
class Fish extends Mammel {
    void swim() {
        System.out.println("swimming");
    }
}

// Derived class
class Bard extends Mammel {
    void fly() {
        System.out.println("Fly");
    }
}
```
# Hybrid Inheritance

- **hybrid inheritance is the composition of two or more types of inheritance**

<img width="699" alt="image" src="https://user-images.githubusercontent.com/78966839/201651203-9e2c72d5-1501-42f8-b44c-8adedb762307.png">

- java dose not have Multiple inheritence.it have Interfaces.

<img width="278" alt="image" src="https://user-images.githubusercontent.com/78966839/201652755-5f446ada-5e9f-4c07-a88d-6a7ca9ab3ab6.png">

# Ploumorphism
- **Multiple form having the similar work**
- 2 Type of Ploumorphism 
- 1.compile time
- 2.Run time
<img width="696" alt="image" src="https://user-images.githubusercontent.com/78966839/201657749-893250e5-9660-4e22-9047-294952621fe1.png">

# Method Overloading
- Method overloading is a Compile time polymorphism

<img width="676" alt="image" src="https://user-images.githubusercontent.com/78966839/201663728-a2ba370f-e2fd-42bc-88d1-d2c05e2fa3b5.png">


```
public class MetOverloading {
    // OverLoading
    // Multiple function with the same name but different Parameter. --->
    public static void main(String[] args) {
        Calculater calc = new Calculater();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float) 1.5, (float) 2.5));
        System.out.println(calc.sum(1, 2, 4));
    }
}

class Calculater {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
```

# Method Overriding :-
- Run time polymorphism.
<img width="717" alt="image" src="https://user-images.githubusercontent.com/78966839/201666436-1ee71ce4-849e-4a96-b225-6538fae30277.png">

```
public class MetOverriding {
    // Overriding :- Same function with different definition
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat(); // Eat Grass
    }
}

class Animal {
    void eat() {
        System.out.println("Eat anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eat Grass");
    }
}
```

# Package in java

<img width="607" alt="image" src="https://user-images.githubusercontent.com/78966839/201668673-0c1299d9-8d6b-4e3e-a074-4a4d1903a214.png">

<img width="713" alt="image" src="https://user-images.githubusercontent.com/78966839/201669086-fb73febd-2e32-4119-b5ee-8ca63bfa555d.png">

### 2 type of package

<img width="229" alt="image" src="https://user-images.githubusercontent.com/78966839/201669944-1e38ddcf-7a2c-4fc3-b0f4-f8470470e957.png">

# Abstraction 
- **Hidding Internal details and showing requir thing to user**

- Abstraction Implement 2 way
- 1. Abstract class
- 2. Interface

<img width="699" alt="image" src="https://user-images.githubusercontent.com/78966839/201671401-5ddcedb4-1ac9-4643-aa55-d44573828e06.png">

# Abstract Class
- abstract method not  Implementation.
- abstract class object not possible.
- Property initialization top to Down.

<img width="721" alt="image" src="https://user-images.githubusercontent.com/78966839/201713284-7cfe2197-8508-46ff-8f4e-056b94a278ef.png">



```
public class Abstract {
    public static void main(String[] args) {
        Mustange myHorse = new Mustange();
        // Animal -> Horse -> Mustange
    }
}

abstract class Animal {

    Animal() {
        System.out.println("Animal constructer call");
    }

    void eat() { // non-abstract method
        System.out.println("animal eating");
    }

    // abstract method not implement.
    abstract void walk(); // abstract method
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructer call");
    }

    void walk() {
        System.out.println("Horse has 4 lag");
    }
}

class Mustange extends Horse {
    Mustange() {
        System.out.println("Mustange constructer call");
    }
}

class Chicken extends Animal {

    void walk() {
        System.out.println("Horse has 2 lag");
    }
}
```

# interface
- **Interface is a blieprint of a class**

<img width="234" alt="image" src="https://user-images.githubusercontent.com/78966839/201725494-ab02116c-b2e7-41ea-938d-2b221e37c4f3.png">

<img width="748" alt="image" src="https://user-images.githubusercontent.com/78966839/201724939-041d167d-ce93-4f4c-8ad7-21e282710ebc.png">

### need of Interface ?
- Multiple interface in java implement by interface.
- Total Abstraction

<img width="679" alt="image" src="https://user-images.githubusercontent.com/78966839/201726837-171b226c-102d-40b9-adba-362aa03c5a32.png">

# Interface Properties 

<img width="729" alt="image" src="https://user-images.githubusercontent.com/78966839/201730059-172b65c5-0bc6-4fdb-a400-e9b05ead9a8b.png">

## Chace Plaer Interface Program
<img width="637" alt="image" src="https://user-images.githubusercontent.com/78966839/201731744-1658c920-de0d-45b7-b742-d7338cd62a1a.png">

```
public class InherTence {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves(); // up,down,left,right,digonal(int all 4 Diraction)

    }
}

interface ChacePlayer { // Blue Print
    void moves();
}

class Queen implements ChacePlayer {
    public void moves() {
        System.out.println("up,down,left,right,digonal(int all 4 Diraction) ");
    }
}

class Rook implements ChacePlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChacePlayer {
    public void moves() {
        System.out.println("up,down,left,right,Digonal (by 1 stape)");
    }
}
```
# Static Keyword
- **The static keyword is a non-access modifier used for methods and attributes.**
- Not create multiple creation in memory
<img width="648" alt="image" src="https://user-images.githubusercontent.com/78966839/201739227-ff680b5b-da05-41c5-ae58-ef086aa03370.png">

### Nested Classes
<img width="285" alt="image" src="https://user-images.githubusercontent.com/78966839/201739877-c8f56d94-fe42-48b7-a18c-c608fb9999bf.png">

- **stic object create only once in memory.**
<img width="268" alt="image" src="https://user-images.githubusercontent.com/78966839/201744274-2c7a947a-927f-4070-b7bf-944767f8d0d2.png">

# Super Keyword
- Super is Bidefault call by compiler
- refer immediate parent class object.

<img width="650" alt="image" src="https://user-images.githubusercontent.com/78966839/201746053-1af5cb1c-6fb5-4fc7-a6a9-5e0dbb9bd996.png">


```
public class SuPr {
    public static void main(String[] args) {
        Horses h = new Horses();
        System.out.println(h.colorrr);

    }
}

class Animalll {

    String colorrr;

    Animalll() {
        System.out.println("Animal constructer call");
    }
}

class Horses extends Animalll {
    Horses() {
        super(); // refer immediate parent class object.
        super.colorrr = "Brone";
        System.out.println("Horse constructer si created");
    }
}
```
### Home work
<img width="229" alt="image" src="https://user-images.githubusercontent.com/78966839/201749761-f9bac891-1830-4281-b51a-bb87dec077df.png">

---
# Solved Questions Practice
<img width="717" alt="image" src="https://user-images.githubusercontent.com/78966839/201923703-c88e0360-a760-44f6-8adf-634d8fc88d58.png">

<img width="742" alt="image" src="https://user-images.githubusercontent.com/78966839/201925270-78413157-848e-4265-a918-42cf073cd08a.png">

<img width="748" alt="image" src="https://user-images.githubusercontent.com/78966839/201926317-14b24f8c-825e-47eb-a0a7-0c91eee4f277.png">

-**Private and protacted class Object are not created**

## Access modifier in java

<img width="545" alt="image" src="https://user-images.githubusercontent.com/78966839/201926817-32535181-3e56-4a16-95a5-5983bfb15e9b.png">

<img width="727" alt="image" src="https://user-images.githubusercontent.com/78966839/201928218-42fc6771-98df-42c3-92fa-7b3d849f8e28.png">

### Why Opction 3 is correct

- **In java we can assign child object to patent referance**
<img width="375" alt="image" src="https://user-images.githubusercontent.com/78966839/201929130-21586d6e-6e9c-4431-b0ce-b026fd6f1b15.png">

<img width="756" alt="image" src="https://user-images.githubusercontent.com/78966839/201930641-5cdeee50-8311-4e7c-a6e0-474e7458cdf8.png">

<img width="746" alt="image" src="https://user-images.githubusercontent.com/78966839/201933147-d4d6a119-7c95-4e86-8586-c79ae46d5dea.png">

<img width="679" alt="image" src="https://user-images.githubusercontent.com/78966839/201933715-00ebf123-fb0e-49d3-94c0-727b5d72b29b.png">

<img width="697" alt="image" src="https://user-images.githubusercontent.com/78966839/201934937-6bbfba13-fdfa-4030-84f1-5e524aae48b6.png">

<img width="629" alt="image" src="https://user-images.githubusercontent.com/78966839/201935866-d7eef06f-02c2-4f66-b6cc-177afc3e3e5a.png">

<img width="691" alt="image" src="https://user-images.githubusercontent.com/78966839/201936265-52217d7d-6c94-4974-9dfc-8d2fb3d66e70.png">


---
# OOps Practic qustion
<img width="332" alt="image" src="https://user-images.githubusercontent.com/78966839/201921575-28c855ab-6fdb-46e2-99d9-879c0a0aec8b.png">

<img width="333" alt="image" src="https://user-images.githubusercontent.com/78966839/201921604-9df4b7dd-a507-40e3-9a17-745d602e121a.png">
<img width="327" alt="image" src="https://user-images.githubusercontent.com/78966839/201921642-673a2f55-7fc8-4f5f-90af-d2ab5fc97b01.png">

# Oops solution
<img width="343" alt="image" src="https://user-images.githubusercontent.com/78966839/201921790-a37f7695-93db-4778-890d-ca6b3b80f8dd.png">
<img width="347" alt="image" src="https://user-images.githubusercontent.com/78966839/201921831-90f31690-75b0-4000-9934-d1b3f1d43d28.png">
















