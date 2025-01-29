import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> menu = new HashMap<>();

        // Adding menu items
        menu.put("Burger", 5.99);
        menu.put("Pizza", 8.99);
        menu.put("Pasta", 7.49);
        menu.put("Salad", 4.99);
        menu.put("Soda", 1.99);

        System.out.println("Welcome to our restaurant! Here is our menu:");
        for (Map.Entry<String, Double> item : menu.entrySet()) {
            System.out.println(item.getKey() + " - $" + item.getValue());
        }

        double total = 0;
        while (true) {
            System.out.print("Enter item name to order (or type 'done' to finish): ");
            String choice = scanner.nextLine();
            
            if (choice.equalsIgnoreCase("done")) {
                break;
            }
            
            if (menu.containsKey(choice)) {
                total += menu.get(choice);
                System.out.println(choice + " added to your order. Total: $" + total);
            } else {
                System.out.println("Sorry, we don't have that item.");
            }
        }
        
        System.out.println("Your final bill is: $" + total);
        System.out.println("Thank you for dining with us! 🍽️");
        scanner.close();
    }
}