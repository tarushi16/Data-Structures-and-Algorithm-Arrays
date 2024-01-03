import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i =0; i< arr.length; i++){
            System.out.println("enter" + (i+1)+ "no.");
            arr[i] = sc.nextInt();
        }
        System.out.println("this is what you entered");
        for(int x:arr)
            System.out.println(x);
    }
}
