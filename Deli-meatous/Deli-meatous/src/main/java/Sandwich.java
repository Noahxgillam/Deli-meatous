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
            case 4 -> 5.5;
            case 8 -> 7;
            case 12 -> 8.5;
            default -> 0;
        };
        double totalCost = basePrice;
        for (Topping topping : toppings) {
            totalCost = totalCost + topping.getPrice();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Sandwich [Size: " + size + "\", Bread: " + breadType +
                ", Toasted: " + toasted + ", Toppings: " + toppings + "]";
    }
}