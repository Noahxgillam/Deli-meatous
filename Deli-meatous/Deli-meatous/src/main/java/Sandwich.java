import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String breadType;
    private int size;
    private List<Topping> toppings;
    private boolean toasted;

    public Sandwich(int size, String breadType, List<Topping> toppings, boolean toasted) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.toasted = toasted;
    }

    public double calculatePrice() {
        double basePrice = switch (size) {
            case 4 -> 5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 0.0;
        };
        double toppingCost = toppings.stream().mapToDouble(Topping::getPrice).sum();
        return basePrice + toppingCost;
    }

    @Override
    public String toString() {
        return "Sandwich [Size: " + size + "\", Bread: " + breadType +
                ", Toasted: " + toasted + ", Toppings: " + toppings + "]";
    }
}