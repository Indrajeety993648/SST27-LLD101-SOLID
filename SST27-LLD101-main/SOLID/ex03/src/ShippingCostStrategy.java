public interface ShippingCostStrategy {
    boolean supports(String type);

    double calculate(double weightKg);
}