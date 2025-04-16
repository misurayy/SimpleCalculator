import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Simple Calculator ===");

        while (keepRunning) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                keepRunning = false;
                System.out.println("Exiting... Goodbye!");
                continue;
            }

            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    if (b != 0) {
                        int quotient = (int)(a / b);
        double remainder = a % b;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
