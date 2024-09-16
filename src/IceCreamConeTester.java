import java.util.Scanner;

class IceCreamCone {
    private double height;
    private double radius;

    public IceCreamCone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * slantHeight + Math.PI * radius * radius; // Lateral area + base area
    }

    public double getVolume() {
        return (1.0 / 3) * Math.PI * radius * radius * height; // Volume formula for cone
    }
}

public class IceCreamConeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter height of ice cream cone: ");
        double heightInput = scanner.nextDouble();

        System.out.print("Enter radius of ice cream cone: ");
        double radiusInput = scanner.nextDouble();

        IceCreamCone cone = new IceCreamCone(heightInput, radiusInput);


        System.out.printf("Surface Area: %.2f%n", cone.getSurfaceArea());
        System.out.printf("Volume: %.2f%n", cone.getVolume());

        scanner.close();
    }
}