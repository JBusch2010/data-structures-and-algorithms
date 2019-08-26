package tree;

//class containing left and right child nodes
public class Node {
    int key;
    Node left;
    Node right;

    Node (int item){
        key = item;
        left = null;
        right = null;
    }
}
