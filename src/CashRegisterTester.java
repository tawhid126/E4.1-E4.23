 class CashRegister {
    private double purchase;
    private double payment;

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void enterDollars(int dollars) {
        payment += dollars;
    }

    public void enterQuarters(int quarters) {
        payment += quarters * 0.25;
    }

    public double giveChange() {
        return payment - purchase;
    }
}
public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        register.recordPurchase(20.37);
        register.enterDollars(20);
        register.enterQuarters(2);

        System.out.printf("Change: $%.2f%n", register.giveChange());
        System.out.println("Expected: $0.13");
    }
}