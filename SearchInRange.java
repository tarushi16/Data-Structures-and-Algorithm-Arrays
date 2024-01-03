public class SearchInRange {
    public static void main(String[] args) {
        int nums[] = {1,52,78,46,95,87,21,36};
        int target = 46;
        System.out.println(range(nums, target, 2, 4));
    }
    static int range(int[] arr, int target, int start, int end){
        if(arr.length == 0)
            return -1;

        for(int i = start; i <= end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
