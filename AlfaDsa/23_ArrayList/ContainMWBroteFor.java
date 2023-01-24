
import java.util.ArrayList;

public class ContainMWBroteFor {
    // Borte force approch of Contain max water
    public static int StoreWater(ArrayList<Integer> height) {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {// 1st row
            for (int j = i + 1; j < height.size(); j++) { // 2 row
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);

        System.out.println("Contain with most water is " + StoreWater(hight));
    }
}
