package algorithm.sorting;

public class SelectionSorter implements IArraySorter {

    @Override
    public void sort(final int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            int temp = arrayToSort[i];
            int minIndex = min(arrayToSort, i, arrayToSort.length - 1);
            arrayToSort[i] = arrayToSort[minIndex];
            arrayToSort[minIndex] = temp;
        }
    }

    private int min(int[] arr, int startIndex, int endIndex) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
