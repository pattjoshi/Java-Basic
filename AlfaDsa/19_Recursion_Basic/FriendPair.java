public class FriendPair {
    public static int friendPair(int n) {
        if (n == 1 || n == 2) { // Base case
            return n;
        }

        return friendPair(n - 1) + (n - 1) * friendPair(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendPair(3));

    }
}
// friendPair(n - 1) ---> Single choise
// (n - 1) ---> How meney Pair can make
// * friendPair(n - 2) -----> Choishe of pair