import java.util.*;

public class PaymentService {
    private final List<PaymentProvider> providers;

    public PaymentService(List<PaymentProvider> providers) {
        this.providers = providers;
    }

    public PaymentService() {
        this(Arrays.asList(
                new CardPaymentProvider(),
                new UpiPaymentProvider(),
                new WalletPaymentProvider()));
    }

    public String pay(Payment p) {
        for (PaymentProvider provider : providers) {
            if (provider.supports(p.provider)) {
                return provider.pay(p.amount);
            }
        }
        throw new RuntimeException("No provider");
    }
}