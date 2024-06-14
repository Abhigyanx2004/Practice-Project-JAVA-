import java.util.Scanner;

public class PizzaCalculatorss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display welcome message and get user input for pizza size
        System.out.println("Welcome to Pizza Calculator!");
        System.out.println("Please select the size of the pizza:");
        System.out.println("1. Small (8 inches)");
        System.out.println("2. Medium (10 inches)");
        System.out.println("3. Large (12 inches)");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();
        
        // Determine the cost based on pizza size
        double baseCost = 0;
        switch (choice) {
            case 1:
                baseCost = 100; // Small pizza costs 100
                break;
            case 2:
                baseCost = 200; // Medium pizza costs 200
                break;
            case 3:
                baseCost = 300; // Large pizza costs 300
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }
        
        // Get user input for number of pizzas
        System.out.print("Enter the number of pizzas: ");
        int numPizzas = scanner.nextInt();
        if (numPizzas <= 0) {
            System.out.println("Invalid number of pizzas. Exiting...");
            return;
        }
        
        // Get user input for toppings
        System.out.print("Enter the number of toppings per pizza (Rs 20 per topping): ");
        int toppingsPerPizza = scanner.nextInt();
        
        // Calculate cost based on toppings
        double toppingsCost = toppingsPerPizza * 20 * numPizzas;
        
        // Get user input for extra cheese
        System.out.print("Do you want extra cheese? (Yes/No): ");
        String choiceExtraCheese = scanner.next();
        double extraCheeseCost = 0;
        if (choiceExtraCheese.equalsIgnoreCase("Yes")) {
            extraCheeseCost = 10 * numPizzas; // Extra cheese costs 10 per pizza
        }
        
        // Calculate total cost
        double totalCost = (baseCost + toppingsCost + extraCheeseCost) * numPizzas;
        
        // Display the total cost
        System.out.println("Total cost of your order for " + numPizzas + " pizza(s) is: Rs" + totalCost);
        
        // Close the scanner
        scanner.close();
    }
}
