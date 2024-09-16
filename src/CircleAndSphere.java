import java.util.Scanner;

public class CircleAndSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double areaCircle = Math.PI * radius * radius;
        double circumferenceCircle = 2 * Math.PI * radius;

        double volumeSphere = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        double surfaceAreaSphere = 4 * Math.PI * radius * radius;

        System.out.printf("Area of Circle: %.2f%n", areaCircle);
        System.out.printf("Circumference of Circle: %.2f%n", circumferenceCircle);
        System.out.printf("Volume of Sphere: %.2f%n", volumeSphere);
        System.out.printf("Surface Area of Sphere: %.2f%n", surfaceAreaSphere);

        scanner.close();
    }
}