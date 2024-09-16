import java.util.Scanner;

public class RemoveComma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String userInput = scanner.nextLine();


        String numberWithoutComma = userInput.replace(",", "");

        System.out.println(numberWithoutComma);

        scanner.close();
    }
}