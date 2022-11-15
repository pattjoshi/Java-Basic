
public class Oop {
    public static void main(String[] args) {
        Pan p1 = new Pan(); // created a pan object called p1
        p1.setColor("bule"); // set value
        System.out.println(p1.color); // access the object of a function we use (.) Operater
        p1.setTip(1);
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
