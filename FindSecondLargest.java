// to find second largest element in an array.

import java.util.Arrays;

public class FindSecondLargest {
    //approach - 1
    public static int SecondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(SecondLargest(arr));
    }
}
