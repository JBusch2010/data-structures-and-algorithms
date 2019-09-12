package quicksort;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class QuickSortTest {
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
    public void testNull() {
        QuickSort sorter = new QuickSort();
        sorter.sort(null);
    }

    @Test
    public void testEmpty() {
        QuickSort sorter = new QuickSort();
        sorter.sort(new int[0]);
    }

    @Test
    public void testQuickSort() {
        for (Integer i : numbers) {
            System.out.println(i + " ");
        }
        QuickSort sorter = new QuickSort();
        sorter.sort(numbers);

        if (!validate(numbers)) {
            fail("Should not happen");
        }
        assertTrue(true);
    }

    private boolean validate (int[] numbers) {
        for (int i = 0; i < numbers.length -1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }

}