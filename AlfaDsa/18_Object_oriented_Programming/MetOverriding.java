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
