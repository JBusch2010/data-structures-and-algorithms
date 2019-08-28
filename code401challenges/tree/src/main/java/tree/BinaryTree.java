package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

//https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

public class BinaryTree<T> {

    //root of the binary tree
    Node<T> root;

    public BinaryTree () {
        root = null;
    }

    public BinaryTree (Node<T> root) {
        this.root = root;
    }

    //preorder---------------
    public ArrayList<T> preOrder (Node<T> node, ArrayList<T> arrList) {
        if (node == null) {
            arrList.add(node.key);
            //        System.out.println(node.key + " ");
            //recursive call on left child of tree
            preOrder(node.left, arrList);
            //recursive call on right child of tree
            preOrder(node.right, arrList);
        }

        return arrList;
    }

    private ArrayList<T> preOrder () {
        return preOrder(this.root, new ArrayList<>());
    }
//preorder---------------


    //inorder----------------
    public ArrayList<T> inOrder (Node<T> node, ArrayList<T> arrayList) {
        if (node == null) {
            //recursive call on left child of tree
            inOrder(node.left, arrayList);
            arrayList.add(node.key);
//            System.out.println(node.key + " ");
            //recursive call on right child of tree
            inOrder(node.right, arrayList);
        }
        return arrayList;
    }

    private ArrayList<T> inOrder () {
        return preOrder(this.root, new ArrayList<>());
    }
//inorder-----------------


//postorder---------------
    public ArrayList<T> postOrder (Node<T> node, ArrayList<T> arrayList) {
        if (node == null){
            //recursive call on left child of tree
            postOrder(node.left, arrayList);
            //recursive call on right child of tree
            postOrder(node.right, arrayList);
            arrayList.add(node.key);
//            System.out.println(node.key + " ");
        }
        return arrayList;
    }

    private ArrayList<T> postOrder () {
        return preOrder(this.root, new ArrayList<>());
    }
//postorder---------------
}
