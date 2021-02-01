package datastructures;

import java.util.Scanner;

public class StackUsingArray {
    public static void main(String[] args) {
        Stack_ArrayImpl stack = new Stack_ArrayImpl();
        Scanner scan = new Scanner(System.in);

        System.out.println("Stack - Array Implementation\n");

        //checking if stack is empty
        if(stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else
            System.out.println("There are elements in this stack");

        //adding elements to stack.
        stack.push(scan);
        stack.push(scan);

        //displaying stack elements
        stack.display();

        //peek
        System.out.println("Enter position to peek at :");
        int position = scan.nextInt();
        stack.peek(position);

        //checking if stack is full
        if(stack.isFull()) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }

        //finding number of elements in stack
        System.out.println("Number of elements in stack = " + stack.count());

        //removing elements from stack
        stack.pop();
        stack.pop();

    }
}
