import java.util.Arrays;

public class FindDuplicate {
    public static int findDup(int []arr){
        int i;
        int dup = -1;
        Arrays.sort(arr);
        for(i=0; i<arr.length; i++){
            if(arr[i]==arr[i+1]){
                dup=arr[i];
                break;
            }
        }
        return dup;
    }

    public static void main(String[] args) {
        int []arr = {0,2,1,3,1};
        System.out.println(FindDuplicate.findDup(arr));
    }
}
