public class WalletPaymentProvider implements PaymentProvider {
    @Override
    public boolean supports(String provider) {
        return "WALLET".equals(provider);
    }

    @Override
    public String pay(double amount) {
        return "Wallet debit: " + amount;
    }
}