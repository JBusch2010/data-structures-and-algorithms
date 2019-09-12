package quicksort;

public class QuickSort {
    private int[] numbers;
    private int number;

    public void sort(int[] values) {
        //check for empty/null array
        if (values == null || values.length == 0){
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort (int low, int high) {
        int i = low;
        int j = high;

        //get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];

        //divide into two lists
        while (i <= j) {

            //if the current value from the left list is smaller than the pivot
            //element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }

            //if the current value from the right list is larger than the pivot
            //element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // if we found a value in the left list which is larger than the
            // pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the values then increase i and j
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        // witchcraft aka recursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange (int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}

