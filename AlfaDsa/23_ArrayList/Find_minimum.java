import java.util.ArrayList;

public class Find_minimum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(6);
        // Fint Maximum of arrayList
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

        }
        System.out.println("Max Number is " + max);
    }
}
