package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = new BinaryTree();
        bt.add(4);
        bt.add(6);

        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        assertFalse(bt.containsNode(1));
    }

    @Test
    public void givenABinaryTree_DeleteElements(){
        BinaryTree bt = new BinaryTree();
        bt.add(4);
        bt.add(6);

        //check values before delete
        assertTrue(bt.containsNode(6));
        assertTrue(bt.containsNode(4));

        //delete element with value 6
        bt.delete(6);

        //check that deletion is successfully
        assertFalse(bt.containsNode(6));
        assertTrue(bt.containsNode(4));
    }

}