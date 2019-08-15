package linked_list;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    //testing true or false
    @Test
    public void returnFalse() {
        LinkedList list = new LinkedList();

        for(int i = 0; i < 4; i++) {
            list.insert(i);
            System.out.println(list.head.data);
        }
        assertFalse("This should return false", list.includes(4));
        assertTrue("This should return true", list.includes(3));
    }

    @Test
    public void mergeListsTest() {
    }
}