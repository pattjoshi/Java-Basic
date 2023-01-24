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
        ll.addFirst(1);
        ll.addFirst(2);
      
    }
}

// Method :- do some operaction we use menthod
```


## Dyr run 

<img width="414" alt="image" src="https://user-images.githubusercontent.com/78966839/214364545-bfa67d26-848e-49be-9638-372aca1b325f.png">






























