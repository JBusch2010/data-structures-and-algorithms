package code401challenges;

//binary search
public class BinarySearch {
    //returns the index of the key if present in the array
    //otherwise, return -1
    public static int someBinarySearchMethod (int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - 1) / 2;
            //check if key is present at middle
            if (arr[middle] == key)
                return middle;
            //check if key is greater, ignore start
            if (arr[middle] < key)
                start = middle + 1;
            //if key is lesser, ignore end
            else
                end = middle -1;
        }
            //at this point key is not present
        return -1;
    }
}