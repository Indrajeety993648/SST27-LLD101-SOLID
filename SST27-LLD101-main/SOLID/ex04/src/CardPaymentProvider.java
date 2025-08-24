public class CardPaymentProvider implements PaymentProvider {
    @Override
    public boolean supports(String provider) {
        return "CARD".equals(provider);
    }

    @Override
    public String pay(double amount) {
        return "Charged card: " + amount;
    }
}