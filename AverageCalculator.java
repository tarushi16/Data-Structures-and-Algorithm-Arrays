public class AverageCalculator {

     public static double calculateAverage(int... numbers) {
            if (numbers.length == 0) {
                return 0.0; // Return 0 for an empty array to avoid division by zero
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            return (double) sum / numbers.length;
        }

        public static void main(String[] args) {
            // Example usage with different numbers of arguments
            System.out.println("Average of 2, 4, 6, 8: " + calculateAverage(2, 4, 6, 8));
            System.out.println("Average of 5, 10, 15: " + calculateAverage(5, 10, 15));
            System.out.println("Average of 1, 3, 5, 7, 9: " + calculateAverage(1, 3, 5, 7, 9));
            System.out.println("Average of no numbers: " + calculateAverage());
        }
    }


