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
    if(isPremium){
    double basePrice = 1;
    }
    else
        double basePrice = 0;

    @Override
    public String toString() {
        return name + (isExtra ? " (extra)" : "");
    }
}