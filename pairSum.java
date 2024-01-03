public class pairSum {
    //companies - adobe, microsoft
    //pair of sum of elements should be equeal to target.
    //approch-1 -> this code uses nested loop and hence its time complexity is very more.
    public static int PairSum(int[] arr, int target){
        int count = 0;
        int sum;
        for(int i=0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                sum = arr[i]+arr[j];
                if(sum==target){
                    ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(PairSum(arr,10));
    }
}


