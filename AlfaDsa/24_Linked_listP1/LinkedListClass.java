public class LinkedListClass { // crate a class LinkedListClass
    // Linked list me node hona cha e ya , Node class
    public static class Node {
        int data;
        Node next; // referance variable

        public Node(int data) { // constructer
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tell;
    public static int size;

    // Add operaction
    // Add first
    public void addFirst(int data) {
        // crate new node
        Node newNode = new Node(data); // Object
        size++;
        if (head == null) { // If node is Empty
            head = tell = newNode;
            return;
        }
        // step 2 newNode next = head
        newNode.next = head; // link

        // step 3 - head = newNode
        head = newNode;
    }

    // ADD Last node
    public void addLast(int data) {
        // stape 1 = create node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tell = newNode;
        }
        // step 2 newNode next = head
        tell.next = newNode; // link

        // step 3 - head = newNode
        tell = newNode;
    }

    // Print Linked List
    public void print() {
        if (head == null) {
            System.out.println("LL is empty"); // Stating part
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    // add in Middle
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++; //
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i = idx-1;temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first
    public int revoveFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) { // return head = null and tell null
            int val = head.data;
            head = tell = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tell = null;
            size = 0;
            return val;
        }
        // prev : i = size -2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tell.data
        prev.next = null;
        tell = prev;
        size--;
        return val;
    }

    // Iterative search
    public static int iterSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // Key found
                return i;
            }
            temp = head.next;
            i++;
        }
        // Key is not found
        return -1;
    }

    public void reverses() {
        Node prev = null;
        Node curr = tell = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            // Current pointing to Privius
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; // remove first
            return;
        }
        // sz - n
        int i = 1;
        int iToFind = sz - n;
        Node Priv = head;
        while (i < iToFind) {
            Priv = Priv.next;
            i++;
        }
        Priv.next = Priv.next.next;
        return;
    }

    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        ll.deleteNthfromEnd(4);
        ll.print(); // 1->2->3->4->5->

    }
}

// Method :- do some operaction we use menthod