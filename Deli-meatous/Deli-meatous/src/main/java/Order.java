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
        double totalSandwiches = 0;
        for (Sandwich sandwich : sandwiches) {
            totalSandwiches = totalSandwiches + sandwich.calculatePrice();
        }

        double totalDrinks = 0.0;
        for (Drink drink : drinks) {
            totalDrinks = totalDrinks + drink.calculatePrice();
        }


        double totalChips = chips.size() * 1.5;
        return totalSandwiches + totalDrinks + totalChips;
    }

    @Override
    public String toString() {
        return "Order Summary:\nSandwiches: " + sandwiches + "\nDrinks: " + drinks + "\nChips: " + chips +
                "\nTotal Price: $" + calculateTotalPrice();
    }

    public void saveReceipt() {
        ReceiptManager manager = new ReceiptManager();
        manager.generateReceipt(this);
    }
}
