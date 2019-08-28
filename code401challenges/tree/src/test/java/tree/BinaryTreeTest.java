package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    //https://stackoverflow.com/questions/7123555/assertnull-should-be-used-or-assertnotnull
    public void isEmpty () {
        BinaryTree tree = new BinaryTree();

        assertNull(tree.root);
    }

    @Test
    public void containsTest() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        assertTrue(tree.contains(8));
    }

    @Test
    //https://www.baeldung.com/java-binary-tree
    public void inOrderTest() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        assertEquals("[3, 4, 5, 6, 7, 8, 9]", tree.inOrder().toString());
    }


    @Test
    public void preOrderTest() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        assertEquals("[6, 4, 3, 5, 8, 7, 9]", tree.preOrder().toString());
    }
}