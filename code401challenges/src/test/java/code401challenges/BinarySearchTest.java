package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void binarySearch_keyExists() {
        int[] testArray = new int[]{4,8,15,16,23,42};
        int key = 15;
        int expectedIndex = 2;

        assertEquals(expectedIndex, BinarySearch.someBinarySearchMethod(testArray, key));
    }

}