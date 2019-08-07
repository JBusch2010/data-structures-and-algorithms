import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayShift {
    public static void main(String[] args) {
        Integer[] numbersArray = new Integer[]{2,4,6,8};
        System.out.println(Arrays.toString(numbersArray));

// https://kodejava.org/how-can-i-insert-an-element-in-array-at-a-given-position/

        //converting array into a list and adding the new integer
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(numbersArray));
        //adding 5 at index 2
        list.add(2, 5);

        // converting list back to array and printing array with new value
        numbersArray = list.toArray(new Integer[list.size()]);
        System.out.println(Arrays.toString(numbersArray));
    }
}