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

    void think() {
        System.out.println("Think");
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
