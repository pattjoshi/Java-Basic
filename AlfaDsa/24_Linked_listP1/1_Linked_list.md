# Link list part 1

# Intrucuction to link list

- it is a linear type of data structure. 
- element are chain bond
- Single element is call node 

<img width="628" alt="image" src="https://user-images.githubusercontent.com/78966839/214341450-4f4728f1-bcb2-45ab-94a5-10700f33a691.png">


## Link listed Structure

- Single node are devide in to 2 type 
- 1hf :- which type of data store. Ex (int,boolean,string)
- 2ht :- referance :- Pointing next object
- node end with empty null value
- Referance variable :- Referance variable are variable that **point to an object**
- Strore same type of informaction 
- To create a linked list we have to create a class 
- these are the different object of class 

<img width="694" alt="image" src="https://user-images.githubusercontent.com/78966839/214343423-c4686a84-86ef-47fc-bec9-341c5a6836fe.png">


## create a Linked list 

<img width="772" alt="image" src="https://user-images.githubusercontent.com/78966839/214346403-2014eb9a-072d-4054-b4ea-e672bc5a455a.png">

## 2 part of a node 
- Head :- Start 
- Tell  :- End node
- last valid data is Tell node. (not null node)
- if i don't know the mid node then we find from Heand node . Becouse it store the referanct value.

<img width="767" alt="image" src="https://user-images.githubusercontent.com/78966839/214350332-426bb9fa-d7c7-4067-9549-d37a210d2630.png">

# Add in linked List

# Add first
- add in first position
- if the new node is add then it become Head node.

<img width="723" alt="image" src="https://user-images.githubusercontent.com/78966839/214355326-aec422f5-2e6c-4641-9d39-c6d084a47555.png">

## Stape process of create add first

<img width="683" alt="image" src="https://user-images.githubusercontent.com/78966839/214356618-2f1184d0-22ab-4b0a-9752-9fa5568e7d68.png">


## Code o(1)
- Condtant time

```
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

    // Add operaction
    public void addFirst(int data) {
        // crate new node
        Node newNode = new Node(data); // Object
        if (head == null) { // If node is Empty
            head = tell = newNode;
            return;
        }
        // step 2 newNode next = head
        newNode.next = head; // link

        // step 3 - head = newNode
        head = newNode;
    }

    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
        ll.addFirst(2);
        ll.addFirst(1);
      
    }
}

// Method :- do some operaction we use menthod
```


## Dyr run 

<img width="414" alt="image" src="https://user-images.githubusercontent.com/78966839/214364545-bfa67d26-848e-49be-9638-372aca1b325f.png">

# Add Last 

- Add in last 
- 

```
 // ADD Last node
    public void addLast(int data) {
        // stape 1 = create node
        Node newNode = new Node(data);
        if (head == null) {
            head = tell = newNode;
        }
        // step 2 newNode next = head
        tell.next = newNode; // link

        // step 3 - head = newNode
        tell = newNode;
    }
```

## Dry run

<img width="765" alt="image" src="https://user-images.githubusercontent.com/78966839/214369465-b9646218-4d44-4abb-8d0b-6dd58d6dc087.png">


# Print a Linked List

<img width="639" alt="image" src="https://user-images.githubusercontent.com/78966839/214371240-cedb1ec3-fa66-4d73-934c-e86578a822a9.png">

- Travers and print
- null found stop
- Head and tell not change , only temp is change


<img width="376" alt="image" src="https://user-images.githubusercontent.com/78966839/214371574-8eff3cd6-b6a2-482b-b9b1-e64da4070848.png">


```
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

    // Add operaction
    // Add first
    public void addFirst(int data) {
        // crate new node
        Node newNode = new Node(data); // Object
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

    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(3);
        ll.print();

    }
}

// Method :- do some operaction we use menthod
```

### O/p 

```
LL is empty
1->
2->1->
2->1->4->
2->1->4->3->
```
# Add in Middle

<img width="363" alt="image" src="https://user-images.githubusercontent.com/78966839/214477834-11a6b333-9a10-4b58-bb3d-5eeb310806a2.png">

- if new node is added to mideele. then
- 0th node pointing to new node and new node point 1st node.

- **Now index are chanhe**
- T.c is :- constant

<img width="400" alt="image" src="https://user-images.githubusercontent.com/78966839/214478260-3f1e2b8e-82b5-4a91-9a6e-7c7c32ca0b6f.png">

## add index 2 data 3 in middle
- Take tmep = head
- Insett in Idx-1
- Then i create new node , it automaticaly change the Index.

<img width="763" alt="image" src="https://user-images.githubusercontent.com/78966839/214479145-3754c44e-b369-4789-a2ad-b581dff84833.png">

## Code 

```
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

    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);

        ll.print();
        System.out.println("Size of Linked list is : " + ll.size);

    }
}

// Method :- do some operaction we use menthod
```

### o/p

```
1->2->3->4->5->
Size of Linked list is : 5
```

# Remove linked linst

# Remove first
- first node is remove and second node is become Head.
- first node delete by garbage collacter

<img width="706" alt="image" src="https://user-images.githubusercontent.com/78966839/214484567-091acfe6-1e43-48d5-891c-ea11080e1757.png">

- **head node poin to next.head**

<img width="319" alt="image" src="https://user-images.githubusercontent.com/78966839/214484915-eddc6d12-a989-4f1e-8b24-51b270c51e7c.png">


```
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
```

# Remove Last

- find privous node and initial null 
- tell = privius

<img width="738" alt="image" src="https://user-images.githubusercontent.com/78966839/214495580-afe7dde8-d9cb-41cd-9f93-b26811b95240.png">


```
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
```
# Iterative Search

- Secarch for a key in a liked list. reurn the position where it is found.if not found return -1.

<img width="691" alt="image" src="https://user-images.githubusercontent.com/78966839/214801587-8513a0cb-d321-4455-b77e-a342c879f9e7.png">
- take a temp variable and initial awith head.
- iterater
- lenearly search end
- if key found return i
- then store next value in temp
- i++
- not found return -1;


```
    // Iterative search
    public static int iterSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key is not found
        return -1;

    }
```

# reverse a linked list o(n)

<img width="740" alt="image" src="https://user-images.githubusercontent.com/78966839/216109308-9afd126f-abb3-4c65-bdf2-0489e3e8f3e4.png">

```
    public void reverses() {
        Node prev = null;  // 3 veriable
        Node curr = tell = head;
        Node next;
        while (curr != null) {
            next = curr.next; // 4 stape
            // Current pointing to Privius
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
```

# [remove-nth-node-from-end-of-list](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)


















