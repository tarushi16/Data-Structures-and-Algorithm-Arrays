import java.util.Scanner;

public class DivideByZeroWithImprovedExceptionalHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                if (denominator == 0) {
                    throw new ArithmeticException("Zero is an invalid denominator.");
                }

                int result = numerator / denominator;
                System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
            } catch (Exception e) {
                System.err.println("\nException: " + e.getMessage());
                scanner.nextLine(); // discard input so user can try again
            }
        } while (continueLoop);
    }
}

