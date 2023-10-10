import java.util.Arrays;

public class sort0and1 {
    //sort zeros and ones
        public static void sortOneAndZero(int[]arr) {
            int left  = 0, right = arr.length-1;
            int temp;
            while(left<right){
                if(arr[left]==1){
                    if(arr[right]!=1){
                        arr[left] = arr[right];
                        arr[right] = 1;
                    }
                    right--;
                }else
                    left++;
            }
        }

        public static void main(String[] args) {
            int []arr = {0,1,1,0,1,0,1};
            sortOneAndZero(arr);
            System.out.println(Arrays.toString(arr));
        }
    }


