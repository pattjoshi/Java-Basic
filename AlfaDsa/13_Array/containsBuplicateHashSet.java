import java.util.HashSet;

public class containsBuplicateHashSet {
    public static boolean HashSets(int nums[]) {
        HashSet<Integer> set = new HashSet<>(); // HasSet decleare
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(HashSets(nums));
    }
}
// A HashSet is a collection of items where every item is unique, and it is
// found in the java.util package:
