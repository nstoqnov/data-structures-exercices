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

    private boolean containsNodeRecursive(Node current, int value){
        if(current == null){
            return false;
        }
        if(current.value == value){
            return true;
        }
        if(current.value > value){
            return containsNodeRecursive(current.left, value);
        }else{
            return containsNodeRecursive(current.right, value);
        }
    }
    public boolean containsNode(int value){
        return containsNodeRecursive(root, value);
    }
    private Node deleteRecursion(Node current, int value){
        if(current == null){
            return null;
        }
        if(current.value = value){
            //delete node
        }
        if(current.value > value){
            current.left = deleteRecursion(current.left, value);
        }else{
            current.right = deleteRecursion(current.right,value);
        }
        return current;
    }
}
