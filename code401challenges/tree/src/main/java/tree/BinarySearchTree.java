package tree;

//https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
public class BinarySearchTree extends BinaryTree<Integer> {

    public BinarySearchTree() {
        super();
    }

    public void add(int key) {
        Node<Integer> addedNode = new Node<>(key);

        //if the root is null add node
        if(this.root == null) {
            this.root = addedNode;

        }
        addNode(this.root, addedNode);

    }

    private void addNode(Node<Integer> node, Node<Integer> addedNode) {
        if (addedNode.key < node.key) {

            //if left node is null make it new node
            if (node.left == null) {
                node.left = addedNode;
            } else {
                addNode(node.left, addedNode);
            }
        } else if (addedNode.key > node.key) {

            //do the same for right side if its null
            if (node.right == null) {
                node.right = addedNode;
            } else {
                addNode(node.right, addedNode);
            }

        }
    }

    // https://www.baeldung.com/java-binary-tree
    public boolean contains(int key) {

        //returning the method
        return containsNodeRecursive(this.root, key);
    }

    private boolean containsNodeRecursive(Node<Integer> current, int key) {
        //if current node is null return false
        if (current == null) {

            return false;
        }
        //if the node matches the key return true
        if (key == current.key) {

            return true;
        }

        //checking left and right nodes
        if (key < current.key) {

            return containsNodeRecursive(current.left, key);
        } else {

            return containsNodeRecursive(current.right, key);
        }
    }

}
