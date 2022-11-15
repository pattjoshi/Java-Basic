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