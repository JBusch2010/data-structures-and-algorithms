package quicksort;

public class QuickSort {
//    ALGORITHM QuickSort(arr, left, right)
    public void quickSort(int arr[], int left, int right){
        //    if left < right
        // Partition the array by setting the position of the pivot value
        if(left < right){
            int position = Partition(arr, left, right);

            //recursively sort elements before
            // partition and after partition
            quickSort(arr, left, position-1);
            quickSort(arr, position+1, right);

        }
    }
//    ALGORITHM Partition(arr, left, right)
//    DEFINE position <-- Partition(arr, left, right)

    private int Partition (int[] arr, int left, int right) {

        // create a variable to track the largest index of numbers lower than the defined pivot
        int pivot = arr[right];

        // index of smaller element
        int i = left-1;

        // for i <- left to right do
        // if arr[i] <= pivot
        for (int j = left; j < right; j++){
            if(arr[j] < pivot) {

                // low++
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[i+j] and arr[right]
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;

        return i+1;
    }

}

