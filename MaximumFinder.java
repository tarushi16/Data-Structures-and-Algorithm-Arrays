import java.util.Scanner;
public class MaximumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int maximum = num1;
        if (num2 > maximum) {
            maximum = num2;
        }
        if (num3 > maximum) {
            maximum = num3;
        }
        System.out.println("The maximum of the three numbers is: " + maximum);
    }
}
