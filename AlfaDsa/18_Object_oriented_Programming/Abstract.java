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

// Property intialization top to Down.