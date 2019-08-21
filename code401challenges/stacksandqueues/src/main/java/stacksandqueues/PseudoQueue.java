package stacksandqueues;

import java.util.Stack;

public class PseudoQueue<T> {
public Stack<T> stack1;
public Stack<T> stack2;

public PseudoQueue () {
    this.stack1 = new Stack<>();
    this.stack2 = new Stack<>();
}

public void enqueue (T value) {
    this.stack1.push(value);
}

public T dequeue () {
    if (this.stack1 == null && this.stack2 == null) {
        return null;
    } else {
        if (this.stack2 == null) {
            while (this.stack1 != null) {
                this.stack2.push(this.stack1.pop());
            }
        }

        return this.stack2.pop();
    }
}


}