public class MaxArayy {
    //max ele in array
    static int array(int[] a){
        int max = a[0];
        for(int i = 1; i<=a.length; i++){
            if(a[i]>a[max])
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = {8,3,15,9,7};
        System.out.println(array(a));
    }
}
