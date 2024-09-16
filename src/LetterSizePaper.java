public class LetterSizePaper {
    public static void main(String[] args) {
        final double INCH_TO_MM = 25.4;
        final double WIDTH_INCHES = 8.5;
        final double HEIGHT_INCHES = 11;

        double width_mm = WIDTH_INCHES * INCH_TO_MM;
        double height_mm = HEIGHT_INCHES * INCH_TO_MM;

        double perimeter = 2 * (width_mm + height_mm);
        double diagonal = Math.sqrt(width_mm * width_mm + height_mm * height_mm);

        System.out.printf("Width: %.2f mm%n", width_mm);
        System.out.printf("Height: %.2f mm%n", height_mm);
        System.out.printf("Perimeter: %.2f mm%n", perimeter);
        System.out.printf("Diagonal: %.2f mm%n", diagonal);
    }
}