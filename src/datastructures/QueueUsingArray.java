package datastructures;

public class QueueUsingArray {
    int front, rear;
    int maxSize = 10;
    int[] myQueue = new int[maxSize];

    QueueUsingArray() {
        front = 0;
        rear = -1;
    }

    //checking if queue is empty
    boolean isEmpty() {
        return (rear == -1);
    }

    //checking if queue is full
    boolean isFull() {
        return (rear == maxSize);
    }

    //to add values to the queue
    //addition or insertion happens through the rear
    boolean enqueue(int value) {
        if(isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        rear++;
        myQueue[rear] = value;
        System.out.println("Item added.");
        return true;
    }

    //to remove values from the queue
    //deletion occurs at the front
    boolean dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return false;
        }
        front++;
        System.out.println("Item removed.");
        return true;
    }

    //to peek at first value in queue
    void peek() {
        System.out.println("First value is : " + myQueue[front]);
    }

    //to display values
    void display() {
        for(int i=front; i<=rear; i++) {
            System.out.print(myQueue[i] + " ");
        }
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();

        System.out.println("is Queue empty? : " + queue.isEmpty());
        System.out.println("is Queue full? : " + queue.isFull());

        System.out.println("\nAdding values to the queue");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println("\nPrinting Queue");
        queue.display();

        System.out.println("\n\nRemoving values from the queue");
        queue.dequeue();
        queue.dequeue();
        System.out.println("\nPrinting Queue");
        queue.display();
    }
}
