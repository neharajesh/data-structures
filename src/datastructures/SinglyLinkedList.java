package datastructures;

public class SinglyLinkedList {
    //Node of a SLL
    //creating an inner class
    //this is a static member of the outer class
    class Node {
        int data;
        Node next;  //pointer

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Head and Tail of the SLL
    public Node head = null;
    public Node tail = null;

    //adding a node to the SLL
    public void addNode(int data) {
        //create a new node
        Node newNode = new Node(data);

        //checking if list is empty
        if(head == null) {
            //if SLL is empty, head and tail will point to new node that we've added
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail, such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will now become tail of the SLL
            tail = newNode;
        }
    }

    //displaying all the nodes present in the SLL
    public void display() {
        //Creating a new node "current" which points to head
        Node current = head;

        //checking if SLL is empty
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        //if not empty, printing nodes
        System.out.println("Nodes of a SLL : ");
        while(current != null) {
            //prints each node by incrementing the pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();   //adding a horizontal line
    }

    //main method
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        //adding nodes to the sll
        sll.addNode(1);
        sll.addNode(2);
        sll.addNode(3);
        sll.addNode(4);
        sll.addNode(5);

        //display all nodes present in the SLL
        sll.display();
    }
}
