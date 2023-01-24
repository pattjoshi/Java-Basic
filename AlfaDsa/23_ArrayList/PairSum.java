import java.util.ArrayList;

public class PairSum {

    public static boolean sumPair(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else if (list.get(lp) + list.get(rp) > target) {
                rp--;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1 2 3 4 5 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int targrt = 5;
        System.out.println(sumPair(list, targrt));

    }
}
