import java.util.Scanner;

public class BreakIntegerIntoDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (up to 5 digits): ");
        int number = scanner.nextInt();

        String numberStr = Integer.toString(number);

        for (int i = 0; i < numberStr.length(); i++) {
            System.out.print(numberStr.charAt(i));
            if (i < numberStr.length() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scanner.close();
    }
}