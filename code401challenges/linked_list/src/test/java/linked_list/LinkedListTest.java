package linked_list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList list = new LinkedList();
    LinkedList list1 = new LinkedList();
    LinkedList list2 = new LinkedList();

    //testing true or false
    @Test
    public void returnFalse() {

        for(int i = 0; i < 4; i++) {
            list.insert(i);
            System.out.println(list.head.data);
        }
        assertFalse("This should return false", list.includes(4));
        assertTrue("This should return true", list.includes(3));
    }

    @Test public void testToString() {
        LinkedList.insert(1);
        LinkedList.insert(2);
        LinkedList.insert(3);
        LinkedList.insert(4);
        LinkedList.insert(5);
        LinkedList.insert(6);
        LinkedList.insert(7);
        LinkedList.insert(8);
        assertEquals("The linked list as a string", "HEAD -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> NULL", list.toString());
    }

    @Test
    public void mergeListsTest() {
            // list 1
            list1.insert(1);
            list1.insert(3);
            list1.insert(5);

            // list 2
            list2.insert(2);
            list2.insert(4);
            list2.insert(6);

            assertEquals("The lists should be merged together alternately","HEAD -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> NULL", list1.mergeLists(list1, list2).toString());
            list1.insert(7);
            assertEquals("The lists should be merged together alternatively", "HEAD -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> NULL", list1.mergeLists(list1, list2).toString());
            list2.insert(8);
            list2.insert(9);
            assertEquals("HEAD -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> NULL", list1.mergeLists(list1, list2).toString());
    }

    @Test
    public void append () {
        LinkedList.insert(1);
        LinkedList.insert(2);
        LinkedList.insert(3);
        LinkedList.insert(4);
        LinkedList.insert(5);
        LinkedList.insert(6);
        LinkedList.insert(7);
        LinkedList.insert(8);
        list.append(9);
        assertEquals("It should add multiple values at the end of the linked list","HEAD -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> NULL", list.toString());
    }

    @Test
    public void multiAppend () {
        LinkedList.insert(1);
        LinkedList.insert(2);
        LinkedList.insert(3);
        LinkedList.insert(4);
        LinkedList.insert(5);
        LinkedList.insert(6);
        LinkedList.insert(7);
        LinkedList.insert(8);
        list.append(9);
        list.append(10);
        list.append(11);
        assertEquals("It should add the values at the end","HEAD -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 11 -> NULL", list.toString());
    }

    @Test
    public void insertBefore () {
        LinkedList.insert(1);
        LinkedList.insert(2);
        LinkedList.insert(3);
        LinkedList.insert(4);
        LinkedList.insert(5);
        LinkedList.insert(6);
        LinkedList.insert(7);
        LinkedList.insert(8);
        list.insertBefore(4, 10);
        assertEquals("It should add the new value before the given value in the linked list","HEAD -> 1 -> 2 -> 3 -> 10 -> 4 -> 5 -> 6 -> 7 -> 8 -> NULL", list.toString());

    }

    @Test
    public void insertAfter () {
        LinkedList.insert(1);
        LinkedList.insert(2);
        LinkedList.insert(3);
        LinkedList.insert(4);
        LinkedList.insert(5);
        LinkedList.insert(6);
        LinkedList.insert(7);
        LinkedList.insert(8);
        list.insertAfter(4, 10);
        assertEquals("It should add the new value after the given value in the linked list","HEAD -> 1 -> 2 -> 3 -> 4 -> 10 -> 5 -> 6 -> 7 -> 8 -> NULL", list.toString());

    }
}