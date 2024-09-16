import java.util.Scanner;

public class PowersOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = number * number;
        double cube = number * number * number;
        double fourthPower = Math.pow(number, 4);

        System.out.printf("Square: %.2f%n", square);
        System.out.printf("Cube: %.2f%n", cube);
        System.out.printf("Fourth Power: %.2f%n", fourthPower);

        scanner.close();
    }
}