package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue () {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue(1);

        assertEquals(1, (int) pseudoQueue.stack1.peek());
    }

    @Test
    public void multiEnqueue () {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
        pseudoQueue.enqueue(1);
        pseudoQueue.enqueue(2);
        pseudoQueue.enqueue(3);

        assertEquals(3, (int) pseudoQueue.stack1.peek());
    }
}