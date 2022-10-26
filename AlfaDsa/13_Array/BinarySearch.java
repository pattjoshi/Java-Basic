public class BinarySearch {
    public static int get_largest_Bs(int number[], int key) {
        int start = 0, end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisions
            if (number[mid] == key) {// found
                return mid;
            }

            if (number[mid] < key) { // right
                start = mid + 1;
            } else { // left 1st haf
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 14 };// must be sorting array
        int key = 14;
        System.out.println(get_largest_Bs(number, key));
    }
}
