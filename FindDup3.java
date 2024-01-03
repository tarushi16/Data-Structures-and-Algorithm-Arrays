public class FindDup3 {

    public static void findDup3(int[] arr) {
        for(int i = 0; i<arr.length;i++){
            int x = arr[i]%arr.length;
            arr[x] = arr[x]+arr.length;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]/arr.length>=2){
                System.out.println(i);
            }
        }
    }
//finding multiple duplicates from an array.
    public static void main(String[] args) {
        int []arr = {4,3,2,7,5,2,3,0};
        findDup3(arr);
    }
}
