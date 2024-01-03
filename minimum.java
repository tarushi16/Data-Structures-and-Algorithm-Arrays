public class minimum {
    public static void main(String[] args) {
        int[] arr = {18,12,72,51,-7,3,6,8,61};
        System.out.println(min(arr));
    }
    static int min(int arr[]){
        int ans =arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<ans)
                ans = arr[i];
        }
        return ans;
    }
}
