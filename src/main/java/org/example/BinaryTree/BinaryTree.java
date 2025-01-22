package org.example.BinaryTree;

public class BinaryTree {
    Node root;

    private Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        if(current.value > value){
            current.left = addRecursive(current.left, value);
        } else if (current.value < value) {
            current.right = addRecursive(current.right, value);
        }else{
            return current;
        }
        return current;
    }
    public void add(int value){
        root = addRecursive(root, value);
    }
}
