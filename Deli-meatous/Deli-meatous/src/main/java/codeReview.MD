Your code looks well-structured and implements an ordering system effectively! Here are some review points for potential improvements:

Strengths
✅ Modularity: Well-defined classes (Sandwich, Order, Drink, Topping, etc.), keeping responsibilities clear. ✅ Encapsulation: Use of private fields and constructors ensures controlled data access. ✅ Switch Expressions: The modern switch syntax improves readability in calculatePrice() methods. ✅ Stream API Usage: mapToDouble() in calculatePrice() makes calculations cleaner.

Areas for Improvement
🔹 Handling Toppings in Sandwich Class

Currently, toppings are passed as List.of(), meaning sandwiches have no toppings. Consider allowing users to customize toppings dynamically.

🔹 Error Handling for User Input

If the user enters an invalid size or boolean for toasted, it could cause a crash. Adding validation would improve user experience.

🔹 Receipt File Path Handling

Hardcoding the file path in Receiptmanager limits portability. Consider using a relative path or allowing user configuration.

🔹 Improve toString() Formatting

The Order and Sandwich summary output could be formatted more neatly to enhance readability.