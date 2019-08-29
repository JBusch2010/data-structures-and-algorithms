package tree;

public class FizzBuzz {

    public FizzBuzz () {}

    public BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> fizzybuzzy) {
        //calling fizzbuzz on the tree
        fizzBuzz(fizzybuzzy.root);

            //returning the fizzbuzzed tree
        return fizzybuzzy;
    }
    //https://www.geeksforgeeks.org/fizz-buzz-implementation/

    private void fizzBuzz(Node<Object> node) {
        if (node != null) {

            // if key node is divisible by 3 and 5 change it to FizzBuzz
            if ((int)node.key % 3 == 0 && (int)node.key % 5 == 0) {
                node.key = "FizzBuzz";

                // if key node is divisible by 3 change it to Fizz
            } else if ((int)node.key % 3 == 0) {
                node.key = "Fizz";

                // if key node is divisible by 5 change it to Buzz
            } else if ((int)node.key % 5 == 0) {
                node.key = "Buzz";
            }

            //doing fizzbuzz on left and right nodes
            fizzBuzz(node.left);
            fizzBuzz(node.right);
        }
    }
}