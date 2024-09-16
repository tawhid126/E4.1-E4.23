import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first time (HHMM): ");
        int firstTime = scanner.nextInt();

        System.out.print("Please enter the second time (HHMM): ");
        int secondTime = scanner.nextInt();

        int firstHours = firstTime / 100;
        int firstMinutes = firstTime % 100;

        int secondHours = secondTime / 100;
        int secondMinutes = secondTime % 100;

        int totalFirstMinutes = firstHours * 60 + firstMinutes;
        int totalSecondMinutes = secondHours * 60 + secondMinutes;

        int diffMinutes;

        if (totalFirstMinutes <= totalSecondMinutes) {
            diffMinutes = totalSecondMinutes - totalFirstMinutes;
        } else {
            diffMinutes = (1440 - totalFirstMinutes) + totalSecondMinutes; // Handle overnight case
        }

        int hoursDifference = diffMinutes / 60;
        int minutesDifference = diffMinutes % 60;

        System.out.printf("%d hours %d minutes%n", hoursDifference, minutesDifference);

        scanner.close();
    }
}