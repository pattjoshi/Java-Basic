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
