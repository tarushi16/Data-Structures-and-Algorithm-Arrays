public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {12, 45, 89, 52, 75, 19, 8};
        int target = 19;
        System.out.println(linearSearch(nums, target));
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
