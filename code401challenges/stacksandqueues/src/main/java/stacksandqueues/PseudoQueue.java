package stacksandqueues;

import java.util.Stack;

public class PseudoQueue<T> {
public Stack<T> stack1;
public Stack<T> stack2;

public PseudoQueue () {
    this.stack1 = new Stack<>();
    this.stack2 = new Stack<>();
}
//push value to stack 1
public void enqueue (T value) {
    this.stack1.push(value);
}

public T dequeue () {
    //if both stacks are empty return null
    if (this.stack1 == null && this.stack2 == null) {
        return null;
    } else {
        //if stack 2 is empty
        if (this.stack2 == null) {
            //while stack 1 is not
            while (this.stack1 != null) {
                //push stack 1 to stack 2 and pop from stack
                this.stack2.push(this.stack1.pop());
            }
        }
        //return the value
        return this.stack2.pop();
    }
}


}