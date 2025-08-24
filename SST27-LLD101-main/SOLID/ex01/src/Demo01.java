
public class Demo01 {
    public static void main(String[] args) {
        Notifier notifier = new EmailClient();
        TaxCalculator taxCalculator = new TaxCalculator(0.18);
        OrderService orderService = new OrderService(notifier, taxCalculator);
        orderService.checkout("a@shop.com", 100.0);
    }
}
