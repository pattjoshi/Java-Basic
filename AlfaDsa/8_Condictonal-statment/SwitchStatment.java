public class SwitchStatment {
    public static void main(String[] args) {
        int num = 3;
        switch (num) {
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Mango Shake");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
