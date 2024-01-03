public class overloading2 {
    static int reverse(int n ){
        int rev = 0;
        while(n>0){
            int r = n%10;
            rev = rev * 10 + r;
            n = n/10;
        }
        return rev;
    }
    static int[ ] reverse(int[] arr){
       int b[] = new int[arr.length];
       for(int i = arr.length-1, j=0; i>=0; i--, j++)
           b[j] = arr[i];
       return b;
      }





    public static void main(String[] args) {
        int arr[] = {3,2,1};
        System.out.println(arr);
        System.out.print(reverse(237));
    }
}
