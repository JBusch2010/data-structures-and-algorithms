package code401challenges;

//binary search
public class BinarySearch {
    //returns the index of the key if present in the array
    //otherwise, return -1
    public static int someBinarySearchMethod (int[] arr, int key) {
        //keep track of start
        int start = 0;
        //keep track of end
        int end = arr.length;
        while (start <= end) {
            int middle = (start + end) / 2;
            //check if key is present at middle
            if (arr[middle] == key)
                return middle;
            //check if key is greater, ignore start
            if (arr[middle] < key)
                start = middle + 1;
            //if key is lesser, ignore end
            else
                end = middle;
        }
            //at this point key is not present
        return -1;
    }
}