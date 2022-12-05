public class SearchRotated {

    public static int Search(int arr[], int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        // case FOUND
        if (arr[mid] == target) {
            return mid;
        }
        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a : Left
            if (arr[si] <= target && target <= arr[mid]) {
                return Search(arr, target, si, mid - 1);
            } else {
                // case b: right
                return Search(arr, target, mid + 1, ei);
            }
        }
        // mid on L2
        else {
            // case c : right
            if (arr[mid] <= target && target <= arr[ei]) {
                return Search(arr, target, mid + 1, ei);
            } else {
                // case D : left
                return Search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 8, 9 };
        int tarIdx = Search(arr, 8, 0, arr.length - 1);
        System.out.println(tarIdx);

    }
}
