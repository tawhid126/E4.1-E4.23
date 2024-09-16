import java.util.Scanner;

class SodaCan {
    private double height;
    private double diameter;

    public SodaCan(double height, double diameter) {
        this.height = height;
        this.diameter = diameter;
    }

    public double getVolume() {
        double radius = diameter / 2;
        return Math.PI * radius * radius * height;
    }

    public double getSurfaceArea() {
        double radius = diameter / 2;
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius); // Lateral area + top/bottom area
    }
}

 public class SodaCanTester {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);


         System.out.print("Enter height of soda can: ");
         double heightInput = scanner.nextDouble();

         System.out.print("Enter diameter of soda can: ");
         double diameterInput = scanner.nextDouble();

         SodaCan can = new SodaCan(heightInput, diameterInput);

         System.out.printf("Surface Area: %.2f%n", can.getSurfaceArea());
         System.out.printf("Volume: %.2f%n", can.getVolume());

         scanner.close();
     }
 }