import java.util.ArrayList;
import java.util.List;

class Sandwich {
    String size;
    String breadType;
    List<String> toppings = new ArrayList<>();
    boolean isToasted;
    int basePrice;

    public Sandwich(String size, String breadType) {
        this.size = size;
        this.breadType = breadType;
    }

    private int getBasePrice() {
        return switch (size) {
            case ""
            case""
        }
    }
}
