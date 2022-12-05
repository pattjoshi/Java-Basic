public class MajorityElement {
    // Given an array nums of size n, return the majority element.

    // The majority element is the element that appears more than ⌊n / 2⌋ times. You
    // may assume that the majority element always exists in the array.

    public static int megorityElement(int num[]) {
        int megorityCount = num.length / 2;

        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count += 1;
                }

            }
            if (count > megorityCount) {
                return num[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int num[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.print(megorityElement(num));
    }
}
