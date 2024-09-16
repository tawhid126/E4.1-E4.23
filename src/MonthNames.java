import java.util.Scanner;

public class MonthNames {
    public static void main(String[] args) {
        String months = "January   February  March     April     May       June      July      August    September October    November   December   ";

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter month number (1-12): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number!");
        } else {
            String monthName = months.substring((monthNumber - 1) * 9, (monthNumber - 1) * 9 + 9).trim();
            System.out.println("Month: " + monthName);
        }

        scanner.close();
    }
}