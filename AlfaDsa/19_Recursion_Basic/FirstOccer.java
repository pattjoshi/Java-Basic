public class FirstOccer {
    // find the first occerance of an element in array
    public static int Occ1st(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;// Key is not found
        }
        if (arr[i] == key) {
            return i;
        }
        return Occ1st(arr, key, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 7, 6, 5, 3, 6, 5 };
        System.out.println(Occ1st(arr, 5, 0));
    }
}
