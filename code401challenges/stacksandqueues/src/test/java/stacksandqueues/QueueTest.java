package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    Queue queue = new Queue();

    @Test
    public void enqueueTest () {
        queue.enqueue(1);
        assertEquals("The value should be added to the queue", "FRONT -> 1 -> NULL", queue.toString());
    }

    @Test
    public void multienqueueTest () {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        assertEquals("The value should be added to the queue", "FRONT -> 1 -> 2 -> 3 -> 4 -> 5 -> NULL", queue.toString());
    }

    @Test
    public void dequeueTest () {
        queue.enqueue(1);
        assertEquals("This should return the popped value", 1, queue.dequeue());
    }

    @Test
    public void peekTest () {
        queue.enqueue(1);
        assertEquals("This should return the value of the given node", 1, queue.peek());
    }
}