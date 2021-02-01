package datastructures;

public class DoublyLinkedList {
    //Create a node
    //inner class
    class Node{
        int data;
        Node previous;  //pointer to prev node
        Node next;  //pointer to next node

        public Node(int data) {
            this.data = data;
        }
    }

    //Head and Tail of the DLL
    Node head = null;
    Node tail = null;


    //Adding a node to the DLL
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Check if DLL is empty
        if(head == null) {
            //head and tail will point to newNode
            head = tail = newNode;
            //head's previous and tail's next will point to null
            //as there is only 1 node in DLL right now
            head.previous = null;
            tail.next = null;
        } else {
            //new node will be added as the tail's next pointer
            tail.next = newNode;
            //set newNode's previous to tail
            newNode.previous = tail;
            //now newNode should become the tail
            tail = newNode;
            //set tail's next to null, denoting end of list
            tail.next = null;
        }
    }

    //displaying all nodes in the DLL
    public void display() {
        //Create current node which points to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of the DLL : ");
        while(current != null) {
            //prints each node by incrementing next pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    //displays nodes in reverse order
    public void displayReverse() {
        //create node which points to tail
        Node current = tail;
        if(tail == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes in reverse : ");
        while(current != null) {
            //prints each node by decrementing previous pointer
            System.out.print(current.data + " ");
            current = current.previous;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        //adding nodes to the DLL
        dll.addNode(1);
        dll.addNode(2);
        dll.addNode(3);
        dll.addNode(4);
        dll.addNode(5);

        //display nodes
        dll.display();

        //displays nodes in reverse
        dll.displayReverse();
    }
}
