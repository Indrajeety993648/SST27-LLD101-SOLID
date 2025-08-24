public class OvernightShippingCost implements ShippingCostStrategy {
    @Override
    public boolean supports(String type) {
        return "OVERNIGHT".equals(type);
    }

    @Override
    public double calculate(double weightKg) {
        return 120 + 10 * weightKg;
    }
}