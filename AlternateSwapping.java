public class AlternateSwapping {
//companies - samsung
    //alternate swappinf od nos in array
    public static void alternateSwap(int [] arr){
        int temp;
        for(int i=0; i<arr.length; i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,7,5,1};
        System.out.println("before swapping");
        for(int x:arr)
            System.out.println(x);
        alternateSwap(arr);
        System.out.println("after swap");
        for(int x:arr)
            System.out.println(x);
    }
}
