package mergesort;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class MergeSortTest {
    private int[] numbers;
    private static int size = 7;
    private static int max = 20;

    @Before
    public void setUp() throws Exception {
        numbers = new int[size];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(max);
        }
    }

    @Test
    public void testMergeSort() {
        MergeSort sorter = new MergeSort();
        sorter.sort(numbers);

        for (int i = 0; i < numbers.length -1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                fail("Should not happen");
            }
        }
        assertTrue(true);
    }
}