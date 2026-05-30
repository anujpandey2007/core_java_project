package Bill_generator;

import java.util.Scanner;

public class counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("      Welcome to Restaurant Billing Counter     ");
        System.out.println("================================================");
        System.out.print("Enter Customer/Order Name: ");
        String customerName = scanner.nextLine();
        if (customerName.trim().isEmpty()) {
            customerName = "Walk-in Customer";
        }
        order customerOrder = new order(customerName);

        boolean ordering = true;
        while (ordering) {
            System.out.println("\n--- Select an option to add to the order ---");
            System.out.println("1. Add Burger");
            System.out.println("2. Add Pizza");
            System.out.println("3. Add Beverage");
            System.out.println("4. Generate Bill and Checkout");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = 0;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n--- Burger Customization ---");
                    System.out.print("Select type: 1. Veg (Rs. 79) | 2. Non-Veg (Rs. 99): ");
                    boolean isVeg = true;
                    int vegChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (vegChoice == 2) {
                        isVeg = false;
                    }
                    String burgerName = isVeg ? "Veg Burger" : "Non-Veg Burger";
                    burger newBurger = new burger(burgerName, isVeg);

                    System.out.print("Add Extra Cheese? (Rs. 20) [y/n]: ");
                    String extraCheese = scanner.nextLine().trim().toLowerCase();
                    if (extraCheese.equals("y") || extraCheese.equals("yes")) {
                        newBurger.Extracheese();
                    }

                    System.out.print("Add Extra Aloo Tikki? (Rs. 30) [y/n]: ");
                    String extraTikki = scanner.nextLine().trim().toLowerCase();
                    if (extraTikki.equals("y") || extraTikki.equals("yes")) {
                        newBurger.Extra_aloo_tikki();
                    }

                    System.out.print("Is this a Takeaway? (Rs. 20) [y/n]: ");
                    String takeaway = scanner.nextLine().trim().toLowerCase();
                    if (takeaway.equals("y") || takeaway.equals("yes")) {
                        newBurger.takeaway();
                    }

                    customerOrder.add_item(newBurger);
                    System.out.println(burgerName + " added to the order.");
                    break;

                case 2:
                    System.out.println("\n--- Pizza Customization ---");
                    System.out.print("Select type: 1. Veg (Rs. 300) | 2. Non-Veg (Rs. 400): ");
                    boolean pizzaVeg = true;
                    int pChoice = scanner.nextInt();
                    scanner.nextLine();
                    if (pChoice == 2) {
                        pizzaVeg = false;
                    }
                    String pizzaName = pizzaVeg ? "Veg Pizza" : "Non-Veg Pizza";
                    pizza newPizza = new pizza(pizzaName, pizzaVeg);

                    System.out.print("Add Extra Cheese? (Rs. 80) [y/n]: ");
                    String pCheese = scanner.nextLine().trim().toLowerCase();
                    if (pCheese.equals("y") || pCheese.equals("yes")) {
                        newPizza.addextracheese();
                    }

                    System.out.print("Add Extra Toppings? (Rs. 50) [y/n]: ");
                    String pTopping = scanner.nextLine().trim().toLowerCase();
                    if (pTopping.equals("y") || pTopping.equals("yes")) {
                        newPizza.addextratoping();
                    }

                    System.out.print("Is this a Takeaway? (Rs. 20) [y/n]: ");
                    String pTakeaway = scanner.nextLine().trim().toLowerCase();
                    if (pTakeaway.equals("y") || pTakeaway.equals("yes")) {
                        newPizza.opttakeway();
                    }

                    customerOrder.add_item(newPizza);
                    System.out.println(pizzaName + " added to the order.");
                    break;

                case 3:
                    System.out.println("\n--- Beverage Selection ---");
                    System.out.println("1. Pepsi (Rs. 20 each)");
                    System.out.println("2. Coke (Rs. 30 each)");
                    System.out.println("3. Coffee (Rs. 50 each)");
                    System.out.print("Choose beverage (1-3): ");
                    int bevChoiceInput = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter quantity: ");
                    int qty = scanner.nextInt();
                    scanner.nextLine();
                    if (qty <= 0) qty = 1;

                    brevages newBev = null;
                    if (bevChoiceInput == 1) {
                        newBev = new brevages("Pepsi");
                        newBev.addpepsi(qty);
                    } else if (bevChoiceInput == 2) {
                        newBev = new brevages("Coke");
                        newBev.addcoke(qty);
                    } else if (bevChoiceInput == 3) {
                        newBev = new brevages("Coffee");
                        newBev.coffe(qty);
                    }
                    
                    if (newBev != null) {
                        customerOrder.add_item(newBev);
                        System.out.println(newBev.getName() + " x" + qty + " added to the order.");
                    } else {
                        System.out.println("Invalid beverage choice!");
                    }
                    break;

                case 4:
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please choose between 1 and 4.");
            }
        }
        System.out.println("\nGenerating final bill...");
        customerOrder.display_bill();
        scanner.close();
    }
}