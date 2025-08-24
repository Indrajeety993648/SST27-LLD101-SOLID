import java.util.*;

public class ShippingCostCalculator {
    private final List<ShippingCostStrategy> strategies;

    public ShippingCostCalculator(List<ShippingCostStrategy> strategies) {
        this.strategies = strategies;
    }

    public double cost(Shipment s) {
        for (ShippingCostStrategy strategy : strategies) {
            if (strategy.supports(s.type)) {
                return strategy.calculate(s.weightKg);
            }
        }
        throw new IllegalArgumentException("Unknown type: " + s.type);
    }

    // Convenience constructor for default strategies
    public ShippingCostCalculator() {
        this(Arrays.asList(
                new StandardShippingCost(),
                new ExpressShippingCost(),
                new OvernightShippingCost()));
    }
}
