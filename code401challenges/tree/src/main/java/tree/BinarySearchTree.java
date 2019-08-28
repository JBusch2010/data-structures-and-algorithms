package tree;

//https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
public class BinarySearchTree extends BinaryTree<Integer> {

    public BinarySearchTree() {
        super();
    }

    class Node {
        int key;
        Node left;
        Node right;

        public Node(int item) {
            key = item;
            left = null;
            right = null;
        }
    }
    //root of the tree
    Node root;

    //calling addrec function
    public void add(int key) {
        Node<Integer> addedNode = new Node<>(key);
        root = addRec(root, key);
    }

    //recursive function to insert new key
    Node addRec(Node root, int key) {

        //if the tree is empty return new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        //if not, recurse down the tree
        if (key < root.key)
            root.left = addRec(root.left, key);
        else if (key > root.key)
            root.right = addRec(root.right, key);
        return root;
    }

    public boolean contains (Node node, int key) {
        if (node == null);
        return false;

    }
}
