package algorithm.sorting;

public class MyBubbleSorter implements IArraySorter {

    @Override
    public void sort(final int[] arrayToSort) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < arrayToSort.length; i++) {
                if (arrayToSort[i] < arrayToSort[i - 1]){
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i - 1];
                    arrayToSort[i - 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
