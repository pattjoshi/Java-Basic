public class IterSearch {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tell;

    public int Ineration(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // Not found
        return -1;

    }

    public static void main(String[] args) {
        IterSearch is = new IterSearch();
        is.Ineration(2);
    }
}
