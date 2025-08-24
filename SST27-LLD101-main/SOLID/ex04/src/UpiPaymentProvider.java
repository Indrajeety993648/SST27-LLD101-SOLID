public class UpiPaymentProvider implements PaymentProvider {
    @Override
    public boolean supports(String provider) {
        return "UPI".equals(provider);
    }

    @Override
    public String pay(double amount) {
        return "Paid via UPI: " + amount;
    }
}