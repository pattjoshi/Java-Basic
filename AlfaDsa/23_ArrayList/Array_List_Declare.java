
import java.util.ArrayList;

public class Array_List_Declare {
    public static void main(String[] args) {
        // In java classes name with upercase
        ArrayList<Integer> list = new ArrayList<>();
        // String
        ArrayList<String> list2 = new ArrayList<>();
        // Float
        ArrayList<Float> list3 = new ArrayList<>();

        // Ek element ko list me add karne me o(n) t.c lagta he
        list.add(1); // o(1)
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(8);

        // .size is a Method which return the size of arrayList
        System.out.println(list.size()); // 7

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}
