import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            
            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine();
                handleMenuChoice(choice);
                
                if (choice == 3) {
                    break;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
            }
        }

        input.close();
        System.out.println("Program terminated.");
    }

    public static void displayMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Greet User");
        System.out.println("2. Check if a Number is Even or Odd");
        System.out.println("3. Exit");
    }

    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 3.");
        }
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome to our program.");
    }

    public static void checkEvenOrOdd() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        if (input.hasNextInt()) {
            int number = input.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
            input.next();
        }
    }
}
