public interface PaymentProvider {
    boolean supports(String provider);

    String pay(double amount);
}