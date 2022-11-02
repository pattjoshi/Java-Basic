public class ContainsDuplicate {
    // Brote force
    // Only functions will be given in the code. Please complete the entire code by
    // writing them ainfunction & class on your own.
    public static boolean cont_Duplicate(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(cont_Duplicate(nums));

    }
}
