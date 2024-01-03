public class PairSumApproch2 {
    //less time complexity using 2 variables start and end
   //approch 2
    public static int pairSum1(int[] arr, int target){
        int count = 0;
        int sum ;
        int start = 0, end = arr.length-1;
        while(start<end){
            sum = arr[start] + arr[end];
            if(sum==target){
                ++count;
                start++;
                end--;
            } else if (sum>target) {
                end--;
            } else
                start++;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(pairSum1(arr,6));
    }
}
