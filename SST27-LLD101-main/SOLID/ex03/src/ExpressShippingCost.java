public class ExpressShippingCost implements ShippingCostStrategy {
    @Override
    public boolean supports(String type) {
        return "EXPRESS".equals(type);
    }

    @Override
    public double calculate(double weightKg) {
        return 80 + 8 * weightKg;
    }
}