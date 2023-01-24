
import java.util.ArrayList;

public class PairSum2 {
    public static boolean PrintSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(i + 1)) { // Break poing
                bp = 1;
                break;
            }
        }
        int lp = bp + 1; // Smallest
        int rp = bp; // largest element
        while (lp != rp) {
            // Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            // case 3
            else if (list.get(lp) + list.get(rp) > target) {
                rp = (n + rp - 1) % n;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 11,15,6,8,9,10 target
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 17;
        System.out.println(PrintSum2(list, target));
    }
}
