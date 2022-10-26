public class LinearSearch {
    public static int linear_search(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 12, 54, 99, 22, 88, 55, 44, 14, 10 };
        int key = 10;

        int index = linear_search(number, key);
        if (index == -1) {
            System.out.println("Not exist");
        } else {
            System.out.println("Key found in index no " + index);
        }
    }
}
