public class OrderService {
    private final Notifier notifier;
    private final TaxCalculator taxCalculator;

    public OrderService(Notifier notifier, TaxCalculator taxCalculator) {
        this.notifier = notifier;
        this.taxCalculator = taxCalculator;
    }

    void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.totalWithTax(subtotal);
        notifier.send(customerEmail, "Thanks! Your total is " + total);
        System.out.println("Order stored (pretend DB).");
    }
}