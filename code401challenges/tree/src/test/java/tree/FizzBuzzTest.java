package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    //https://blog.codeleak.pl/2014/11/unit-testing-excercise-with-fizzbuzz.html
    @Test
    public void fizzBuzzTree () {
        BinaryTree<Object> tree = new BinaryTree<>();
        tree.root = new Node<>(10);
        tree.root.left = new Node<>(5);
        tree.root.right = new Node<>(13);
        tree.root.left.left = new Node<>(3);
        tree.root.left.right = new Node<>(7);
        tree.root.right.right = new Node<>(15);
        tree.root.right.left = new Node<>(11);

        FizzBuzz fizzbuzz = new FizzBuzz();

         assertEquals("[Fizz, Buzz, 7, Buzz, 11, 13, FizzBuzz]", fizzbuzz.fizzBuzzTree(tree).inOrder().toString());
    }
}