package datastructures;

public class QueueUsingSLL {
    class Node {
        int data;
        Node next;

        //constructor to create a new SLL node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front, rear;

    QueueUsingSLL() {
        this.front = null;
        this.rear = null;
    }

    //checking if queue is empty
    boolean isEmpty() {
        return (rear== null);
    }

    //adding/inserting values to the queue
    void enqueue(int value) {
        Node newNode = new Node(value);
        this.rear = newNode;
    }

    //removing values from the queue
    void dequeue() {
        Node temp = this.front;
        this.front = this.front.next;

        if(this.front == null)
            this.rear = null;
    }

    //display
    void display() {
        Node node = this.front;
        while(node.next != null) {
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        QueueUsingSLL queue = new QueueUsingSLL();

        System.out.println("is queue empty? : "+ queue.isEmpty());
        System.out.println("\nAdding values to the queue");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Displaying Values : ");
        queue.display();
        System.out.println("\n\nRemoving Values from the queue");
        queue.dequeue();
        queue.dequeue();
        System.out.println("Displaying Values : ");
        queue.display();
    }
}
