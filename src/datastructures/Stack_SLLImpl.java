package datastructures;

public class Stack_SLLImpl {
    //inner class
    class Node {
        int data;
        Node next;
    }

    //creating a top node to denote top of stack
    Node top;

    //checking if stack is empty
    boolean isEmpty() {
        return (top == null);
    }

    //since this is being created using a LL, we won't check if it is full
    //LL - no max size.

    //adding values to the stack
    public void push(int value) {
        //create a new node
        Node node = new Node();

        //checking if stack is full
        if(node == null) {
            System.out.println("Stack is full");
            return;
        }

        //if not full, add data
        node.data = value;
        //put top reference into node's link(node)
        node.next = top;
        //update top reference
        top = node;
    }

    //remove values from stack
    public void pop() {
        //check if stack is empty
        if(top == null) {
            System.out.println("Stack is empty");
            return;
        }
        //update pointer to next node
        top = top.next;
    }

    //display all nodes
    public void display() {
        if(top == null) {
            System.out.println("Stack is empty");
            System.exit(1);
        } else {
            Node temp = top;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}
