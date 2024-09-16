import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (double) sum / 2;
        int distance = Math.abs(difference);
        int maximum = Math.max(num1, num2);
        int minimum = Math.min(num1, num2);

        System.out.printf("Sum: %d\tDifference: %d\tProduct: %d\tAverage: %.2f\tDistance: %d\tMaximum: %d\tMinimum: %d%n",
                sum, difference, product, average, distance, maximum, minimum);

        scanner.close();
    }
}