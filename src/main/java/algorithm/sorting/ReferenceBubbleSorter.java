package algorithm.sorting;

public class ReferenceBubbleSorter implements IArraySorter {

    @Override
    public void sort(final int[] arrayToSort) {
        int n = arrayToSort.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arrayToSort[j-1] > arrayToSort[j]){
                    //swap elements
                    temp = arrayToSort[j-1];
                    arrayToSort[j-1] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }

            }
        }
    }
}
