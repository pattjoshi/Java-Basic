public class Shortest {

    // find shotest path
    public static float getShotest(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i); // diraction
            // South
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShotest(path));
        String n1 = "Toney";
        String n2 = "Toney";
        String n3 = new String("Toney");

        if (n1 == n3) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

        if (n1.equals(n3)) { // it check object
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

    }
}
