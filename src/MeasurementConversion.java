import java.util.Scanner;

public class MeasurementConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter measurement in meters: ");
        double meters = scanner.nextDouble();

        double miles = meters / 1609.34;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        System.out.printf("Miles: %.6f, Feet: %.6f, Inches: %.6f%n", miles, feet, inches);

        scanner.close();
    }
}