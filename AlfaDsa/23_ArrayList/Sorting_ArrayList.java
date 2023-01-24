
import java.util.ArrayList;
import java.util.Collections;;

public class Sorting_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> lsit = new ArrayList<>();
        lsit.add(2);
        lsit.add(42);
        lsit.add(88);
        lsit.add(22);
        lsit.add(12);

        System.out.println("Before swap " + lsit);
        Collections.sort(lsit);
        System.out.println("Before swap " + lsit);
        // Decending
        Collections.sort(lsit, Collections.reverseOrder());
        // Compariter -> logic defind
        System.out.println("Decending order " + lsit);

    }
}
// Collections.sort :- Sort in assending order Default
// Inbuild method
// class :- Collactions
// Interface :- Collaction