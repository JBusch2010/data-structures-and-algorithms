package tree;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

public class BinaryTree {

    //root of the binary tree
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void preOrder(Node node) {
        if (node == null)
            return;

        System.out.println(node.key + " ");
        //recursive call on left child of tree
        preOrder(node.left);
        //recursive call on right child of tree
        preOrder(node.right);
    }

    public void inOrder(Node node) {
        if (node == null)
            return;

        //recursive call on left child of tree
        inOrder(node.left);
        System.out.println(node.key + " ");
        //recursive call on right child of tree
        inOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null)
            return;

        //recursive call on left child of tree
        postOrder(node.left);
        //recursive call on right child of tree
        postOrder(node.right);
        System.out.println(node.key + " ");

    }
}
