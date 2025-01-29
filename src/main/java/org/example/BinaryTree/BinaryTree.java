package org.example.BinaryTree;

public class BinaryTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

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
    private Node deleteRecursive(Node current, int value){
        if(current == null){
            return null;
        }
        if(current.value == value){
            //delete node
            //1st case: check if node for deletion has no children
            //2nd case: check if node has only one child
            //3rd case: node has 2 children
            if(current.right == null && current.left == null){
                return null;
            }else if (current.right == null && current.left != null){
                return current.left;
            } else if (current.left == null && current.right != null) {
                return current.right;
            }else{
                //find smallest value
                int smallestValue = findSmallestValue(current);
                current.value = smallestValue;
                current.right = deleteRecursive(current.right, smallestValue);
                return current;
            }
        }
        if(current.value > value){
            current.left = deleteRecursive(current.left, value);
        }else{
            current.right = deleteRecursive(current.right,value);
        }
        return current;
    }
    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

    public void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.println(" " + node.value);
            traverseInOrder(node.right);
        }
    }
}
