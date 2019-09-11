package quicksort;

public class QuickSort {
//    ALGORITHM QuickSort(arr, left, right)
    public void quickSort(int arr[], int left, int right){
        //    if left < right
        // Partition the array by setting the position of the pivot value
        if(left < right){
            int position = Partition(arr, left, right);

            // Sort the left
            //   QuickSort(arr, left, position - 1)
            // Sort the right
            //    QuickSort(arr, position + 1, right)

        }
    }
//    ALGORITHM Partition(arr, left, right)
//    DEFINE position <-- Partition(arr, left, right)

    private int Partition (int[] arr, int left, int right) {
        // set a pivot value as a point of reference
        // DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        int pivot = arr[right];

        //    DEFINE low <-- left - 1
        int low = left-1;

        // for i <- left to right do
        // if arr[i] <= pivot
        for (int i = left; i < right; i++){
            if(arr[i] <= pivot);

            // low++
            low++;
            // Swap(arr, i, low)
            Swap(arr, i, low);
        }
        return pivot;
    }

    // ALGORITHM Swap(arr, i, low)
    private void Swap (int[] arr, int i, int low) {

        //    DEFINE temp;
        //    temp <-- arr[i]
        int temp = arr[i];

        //    arr[i] <-- arr[low]
        arr[i] = arr[low];

        //    arr[low] <-- temp
        arr[low] = temp;
    }

//
//    // place the value of the pivot location in the middle.
//    // all numbers smaller than the pivot are on the left, larger on the right.
//    Swap(arr, right, low + 1)
//    // return the pivot index point
//     return low + 1
//
}
