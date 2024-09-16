import java.util.Scanner;

public class GasCostCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of gallons of gas in the tank: ");
        double gallonsInput = scanner.nextDouble();

        System.out.print("Enter fuel efficiency in miles per gallon (mpg): ");
        double mpgInput = scanner.nextDouble();

        System.out.print("Enter price of gas per gallon ($): ");
        double pricePerGallonInput = scanner.nextDouble();

        double costPer100Miles = (100 / mpgInput) * pricePerGallonInput;
        double distancePossible = gallonsInput * mpgInput;

        System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Distance possible with gas in tank: %.2f miles%n", distancePossible);

        scanner.close();
    }
}