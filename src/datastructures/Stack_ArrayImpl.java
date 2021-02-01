package datastructures;

import java.util.Scanner;

public class Stack_ArrayImpl {
    int top;
    int maxsize = 10;
    int[] arr = new int[maxsize];

    //checks if stack is empty or not
    boolean isEmpty() {
        //if top=-1, returns true. else false is returned.
        return (top<0);
    }

    //checks if stack is full
    boolean isFull(){
        //if top=maxsize-1, returns true. else returns false
        return (top==maxsize-1);
    }

    Stack_ArrayImpl() {
        //stack will initially be 0
        top = -1;
    }

    //adds values to the stack
    boolean push(Scanner scan) {
        if(isFull()) {
            System.out.println("Stack is full already!");
            return false;
        } else {
            System.out.println("Enter value");
            int value = scan.nextInt();
            //increasing top pointer value by 1
            top++;
            arr[top] = value;
            System.out.println("Item has been pushed.");
            return true;
        }
    }

    //removes values from the stack
    boolean pop() {
        if(isEmpty()) {
            System.out.println("Stack is already empty!");
            return false;
        } else {
            //decreasing top pointer value by 1
            top--;
            System.out.println("Item has been popped.");
            return true;
        }
    }

    //displaying all stack elements
    void display() {
        System.out.println("Printing stack elements :");
        for(int i=0; i<top; i++) {
            System.out.println(arr[i]);
        }
    }

    //returns number of elements in a stack
    int count() {
        if(isEmpty()) {
            return 0;
        } else {
            return (top+1);
        }
    }

    //views value at a given position
    void peek(int position) {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else if(position > top) {
            System.out.println("Invalid Input");
        }
        System.out.println("The element is at : " + arr[position]);
    }
}
