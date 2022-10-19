public class Break {
    public static void main(String[] args) {
        // Break statment is use for Breake the code
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am Out from Loop");
    }
}
