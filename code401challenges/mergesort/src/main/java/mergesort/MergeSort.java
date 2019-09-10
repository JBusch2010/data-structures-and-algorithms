package mergesort;

//https://www.geeksforgeeks.org/merge-sort/
//https://www.baeldung.com/java-merge-sort
public class MergeSort {
    public void mergeSort (int[] arr) {
        int n = arr.length;

        if(n > 1){
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }

        for(int i = mid; i < mid; i++){
            right[i - mid] = arr[i];
        }
    }
}
