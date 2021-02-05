package datastructures;

public class BinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node() {}

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    //root of binary tree
    Node root;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int value) {
        root = new Node(value);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        //creating root
        tree.root = new Node();

        //adding child nodes
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        //adding child node to child node
        //here 4 will be a child of 2
        tree.root.left.left = new Node(4);
    }
}
