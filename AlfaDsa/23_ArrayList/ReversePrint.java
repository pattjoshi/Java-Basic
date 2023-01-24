import java.util.ArrayList;;

public class ReversePrint {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Print reverse o(n)
        list.add(7);
        list.add(3);
        list.add(5);
        list.add(2);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
