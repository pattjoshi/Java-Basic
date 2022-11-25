public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char from_rod,
            char to_rod, char aux_rod) {
        if (n == 0) { // Base case
            return;
        }
        // Transfer top n-1 from sec to helper using dest as 'helper'
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        // Transfer nth from sec to dest
        System.out.println("Move disk " + n + " from rod "
                + from_rod + " to rod "
                + to_rod);
        // Transfer n-1 from helper to dest using sec as 'helper'
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String args[]) {
        int n = 3;
        // towerOfHanoi(n, "A", "B", "C");
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}