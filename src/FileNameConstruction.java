import java.util.Scanner;

public class FileNameConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter drive letter (C): ");
        String driveLetterInput = scanner.nextLine();

        System.out.print("Enter path (\\Windows\\System): ");
        String pathInput = scanner.nextLine();

        System.out.print("Enter file name (Readme): ");
        String fileNameInput = scanner.nextLine();

        System.out.print("Enter extension (txt): ");
        String extensionInput = scanner.nextLine();

        String fullFileName = driveLetterInput + ":" + pathInput + "\\" + fileNameInput + "." + extensionInput;


        System.out.println(fullFileName);

        scanner.close();
    }
}