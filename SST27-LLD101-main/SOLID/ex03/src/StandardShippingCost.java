public class StandardShippingCost implements ShippingCostStrategy {
    @Override
    public boolean supports(String type) {
        return "STANDARD".equals(type);
    }

    @Override
    public double calculate(double weightKg) {
        return 50 + 5 * weightKg;
    }
}