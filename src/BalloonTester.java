 class Balloon {
    private double volume;
    public Balloon() {
        this.volume = 0;
    }

    public void addAir(double amount) {
        this.volume += amount;
    }

    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        double radius = getRadius();
        return 4 * Math.PI * radius * radius;
    }

    public double getRadius() {
        return Math.cbrt((3 * volume) / (4 * Math.PI));
    }
}
 public class BalloonTester {
     public static void main(String[] args) {
         Balloon balloon = new Balloon();

         balloon.addAir(100);
         printBalloonInfo(balloon);

         balloon.addAir(100);
         printBalloonInfo(balloon);
     }

     private static void printBalloonInfo(Balloon balloon) {
         System.out.printf("Current Volume: %.2f cm³%n", balloon.getVolume());
         System.out.printf("Current Radius: %.2f cm%n", balloon.getRadius());
         System.out.printf("Current Surface Area: %.2f cm²%n%n", balloon.getSurfaceArea());
     }
 }