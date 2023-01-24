
import java.util.ArrayList;

public class Swap2Num {
    public static void Swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, idx2);
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Before Swap" + list);

        int idx1 = 1, idx2 = 3;
        Swap(list, idx1, idx2);
        System.out.println("Arter Swap" + list);

    }
}
