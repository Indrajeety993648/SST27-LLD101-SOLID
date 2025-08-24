public class UpiPaymentProvider implements PaymentProvider {
    public boolean supports(String provider) {
        return "UPI".equals(provider);
    }

    public String pay(double amount) {
        return "Paid via UPI: " + amount;
    }
}