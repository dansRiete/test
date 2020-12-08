import java.util.Arrays;
import java.util.Random;

import algorithm.sorting.IArraySorter;
import algorithm.sorting.InsertionSorter;
import algorithm.sorting.MyBubbleSorter;
import algorithm.sorting.SelectionSorter;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class SorterTest {

    public static final int ARR_SIZE = 100000;
    private static final Random RANDOM = new Random();

    @Test
    public void bubbleSortingTest() {
        int[] arrayToSort = new int[ARR_SIZE];
        for(int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = RANDOM.nextInt();
        }
        int[] expected = new int[ARR_SIZE];
        System.arraycopy(arrayToSort, 0, expected, 0, arrayToSort.length);
        long start = System.currentTimeMillis();
        Arrays.sort(expected);
        System.out.printf("Arrays.sort time %d ms.\n", (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        new MyBubbleSorter().sort(arrayToSort);
        System.out.printf("Bubble sort time %d ms.\n", (System.currentTimeMillis() - start));
        assertArrayEquals(arrayToSort, expected);
    }

    @Test
    public void insertionSortingTest() {
        int[] arrayToSort = new int[ARR_SIZE];
        for(int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = RANDOM.nextInt();
        }
        int[] expected = new int[ARR_SIZE];
        System.arraycopy(arrayToSort, 0, expected, 0, arrayToSort.length);
        long start = System.currentTimeMillis();
        Arrays.sort(expected);
        System.out.printf("Arrays.sort time %d ms.\n", (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        new InsertionSorter().sort(arrayToSort);
        System.out.printf("Insertion sort time %d ms.\n", (System.currentTimeMillis() - start));
        assertArrayEquals(arrayToSort, expected);
    }

    @Test
    public void selectionSortingTest() {
        int[] arrayToSort = new int[ARR_SIZE];
        for(int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = RANDOM.nextInt();
        }
        int[] expected = new int[ARR_SIZE];
        System.arraycopy(arrayToSort, 0, expected, 0, arrayToSort.length);
        long start = System.currentTimeMillis();
        Arrays.sort(expected);
        System.out.printf("Arrays.sort time %d ms.\n", (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        new SelectionSorter().sort(arrayToSort);
        System.out.printf("Selection sort time %d ms.\n", (System.currentTimeMillis() - start));
        assertArrayEquals(arrayToSort, expected);
    }
}
