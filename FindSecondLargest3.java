public class FindSecondLargest3 {
    //Better approach and less time complexity
    public static int SecondLargest3(int[] arr){
        int Max , secMax;
        Max = secMax = Integer.MIN_VALUE;
        for(int x : arr){
            if(x>Max){
                secMax = Max;
                Max = x;
            } else {
                if(x>secMax && x!=Max)
                    secMax = x;
            }

        }
        return secMax;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,15,64,3,2,9};
        System.out.println(SecondLargest3(arr));
    }
}
