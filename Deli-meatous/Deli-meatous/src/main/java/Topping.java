public class Topping {
    private String name;
    private boolean isPremium;
    private boolean isExtra;

    public Topping(String name, boolean isPremium, boolean isExtra) {
        this.name = name;
        this.isPremium = isPremium;
        this.isExtra = isExtra;
    }

    public double getPrice() {
        double basePrice = isPremium ? 1.00 : 0.00;
        return isExtra ? basePrice * 1.5 : basePrice;
    }

    @Override
    public String toString() {
        return name + (isExtra ? " (extra)" : "");
    }
}