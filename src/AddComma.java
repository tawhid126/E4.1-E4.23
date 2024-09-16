import java.util.Scanner;

public class AddComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer between 1000 and 999999: ");
        int userInput = scanner.nextInt();

        String formattedNumberWithCommas = String.format("%,d", userInput);


        System.out.println(formattedNumberWithCommas);

        scanner.close();
    }
}