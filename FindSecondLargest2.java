import java.util.Arrays;

public class FindSecondLargest2 {
    // approch 2 for the same question
    public static int SecondLargest2(int[] arr){
        Arrays.sort(arr);
        for(int i = arr.length-1; i>0; i--){
            if(arr[i]!=arr[i-1])
                return arr[i-1];
        }
        return Integer.MIN_VALUE;
    }
   // here the complexity will be O(nlogn) . to decrease its complexity see next program.
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9};
        System.out.println(SecondLargest2(arr));
    }

}
