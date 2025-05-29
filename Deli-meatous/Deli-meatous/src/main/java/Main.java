import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Welcome to Deli-meatous \n Let's build your sandwich");

        while (true) {
            System.out.println("\nOrder Options:");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Choose bread (white, wheat, rye, wrap): ");
                    String bread = scanner.nextLine();

                    System.out.print("Choose size (4, 8, 12 inches): ");
                    int size = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Would you like it toasted? (true/false): ");
                    boolean toasted = scanner.nextBoolean();
                    scanner.nextLine();

                    Sandwich sandwich = new Sandwich(size, bread, List.of(), toasted);
                    order.addSandwich(sandwich);
                }
                case 2 -> {
                    System.out.print("Enter drink size (SMALL, MEDIUM, LARGE): ");
                    Size drinkSize = Size.valueOf(scanner.next().toUpperCase());
                    scanner.nextLine();

                    System.out.print("Enter drink name: ");
                    String drinkName = scanner.nextLine();

                    Drink drink = new Drink(drinkSize, drinkName);
                    order.addDrink(drink);

                    System.out.println("That drink will cost: $" + drink.calculatePrice());
                }
                case 3 -> {
                    System.out.print("Enter chip type: ");
                    String chip = scanner.nextLine();
                    order.addChip(chip);
                }
                case 4 -> {
                    System.out.println("Your total is: $" + order.calculateTotalPrice());
                    order.saveReceipt();
                    System.out.println("Order completed. Thank you!");
                    return;
                }
                case 0 -> {
                    System.out.println("Order canceled.");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}
