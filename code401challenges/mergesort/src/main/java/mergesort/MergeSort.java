package mergesort;

//https://www.geeksforgeeks.org/merge-sort/
//https://www.baeldung.com/java-merge-sort
//https://www.vogella.com/tutorials/JavaAlgorithmsMergesort/article.html

public class MergeSort {
    private int[] numbers;
    private int[] helper;
    
    private int number;
    
    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort (int low, int high) {
        
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            
            //get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            
            // sort the left side of the array
            mergesort(low, middle);
            
            //sort the right side of the array
            mergesort(middle +1, high);
            
            //after sorting them, merge them
            merge(low, middle, high);
            
            
        }
    }

    private void merge (int low, int middle, int high) {

        //copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        //copy the smallest values from either the left or the right side back to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }

        //copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

        //since the sort is happening in place, any leftover numbers are already in the right position
    }
}
