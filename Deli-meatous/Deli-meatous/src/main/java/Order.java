import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<String> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChip(String chip) {
        chips.add(chip);
    }

    public double calculateTotalPrice() {
        double totalSandwiches = sandwiches.stream().mapToDouble(Sandwich::calculatePrice).sum();
        double totalDrinks = drinks.stream().mapToDouble(Drink::calculatePrice).sum();
        double totalChips = chips.size() * 1.50;
        return totalSandwiches + totalDrinks + totalChips;
    }

    @Override
    public String toString() {
        return "Order Summary:\nSandwiches: " + sandwiches + "\nDrinks: " + drinks + "\nChips: " + chips +
                "\nTotal Price: $" + calculateTotalPrice();
    }

    public void saveReceipt() {
        new Receiptmanager().generateReceipt(this);
    }
}
