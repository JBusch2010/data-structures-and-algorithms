package tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

    @Test
    public void isEmpty () {
        BinaryTree tree = new BinaryTree();
        if (tree == null) {
        }
    }


    @Test
    public void preOrder () {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(25);
        tree.add(20);
        tree.add(27);
        tree.add(15);
        tree.add(22);
        tree.add(26);
        tree.add(30);
        tree.add(29);
        tree.add(32);

        assertEquals("[15, 20, 22, 25, 26, 27, 29, 30, 32]", tree.inOrder().toString());
    }
    }

    @Test
    public void inOrder () {
    }

    @Test
    public void postOrder () {
    }
}