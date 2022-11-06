
public class SearchInSorted {
    // Sraie case
    public static boolean stairCase_search(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            // CHECK matrix == key
            if (matrix[row][col] == key) {
                System.out.println("key is found in (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                // LEFT MOVE
                col--;
            } else if (key > matrix[row][col]) {
                // BOTTOM MOVE
                row++;
            }
        }
        System.out.println("Key is not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 33;
        stairCase_search(matrix, key);
    }
}
