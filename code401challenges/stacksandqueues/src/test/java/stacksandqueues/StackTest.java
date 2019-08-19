package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack stack = new Stack();

    @Test
    public void pushTest () {
        stack.push(1);
        assertEquals("The value should be added to the stack", "TOP -> 1 -> NULL", stack.toString());
    }

    @Test
    public void multipushTest () {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals("The values should be added to the stack", "TOP -> 5 -> 4 -> 3 -> 2 -> 1 -> NULL", stack.toString());
    }

    @Test
    public void popTest () {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertEquals("This should return the popped value", 5, stack.pop());
    }

    @Test
    public void peek () {
        stack.push(1);
        assertEquals("This should return the value of the given node",1, stack.peek());
    }
}