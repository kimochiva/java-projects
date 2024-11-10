package arraysAndStrings;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Welcome to the fruit shop!***");
        boolean active = true;

        while (active) {
            System.out.print("\nPlease enter q to quit\nor an item name to search: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("q")) {
                active = false;
                break;
            }
            int itemIndex = inventory.getProductIndex(userInput);
            if (itemIndex != -1) {
                System.out.println(userInput + ": " + inventory.getProductPrice(itemIndex));
            } else {
                System.out.println(userInput + " is not found.");
            }
        }
    }
}
