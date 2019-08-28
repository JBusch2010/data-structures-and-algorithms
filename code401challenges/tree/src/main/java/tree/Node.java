package tree;

//class containing left and right child nodes
public class Node<T> {
    T key;
    Node<T> left;
    Node<T> right;

    Node (T item){
        key = item;
        left = null;
        right = null;
    }
}
