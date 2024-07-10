package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void perform() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {

                System.out.print("Enter first number: ");
                double num1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter second number: ");
                double num2 = Integer.parseInt(scanner.nextLine());

                System.out.print("""
                        What operation do you want to perform? (type numbers)
                        1- Addition
                        2- Subtraction
                        3- Multiplication
                        4- Division
                        """);
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> System.out.println(num1 + " + " + num2 + " = " + performAddition(num1, num2));
                    case 2 -> System.out.println(num1 + " - " + num2 + " = " + performSubtraction(num1, num2));
                    case 3 -> System.out.println(num1 + " x " + num2 + " = " + performMultiplication(num1, num2));
                    case 4 -> {
                        if (num2 != 0) {
                            System.out.println(num1 + " / " + num2 + " = " + performDivision(num1, num2));
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                    }
                    default -> System.out.println("Invalid choice. Please select a valid operation.");

                }
                while (true) {
                    System.out.print("Do you want to perform a calculation again? (y/n): ");
                    String continueInput = scanner.nextLine();
                    if (continueInput.equalsIgnoreCase("y")) {
                        break;
                    } else if (continueInput.equalsIgnoreCase("n")) {
                        return;
                    } else {
                        System.out.println("Invalid input. Please enter 'y' or 'n'.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Type a number!");
            }
        }
    }

    private static double performDivision(double num1, double num2) {
        return num1 / num2;
    }

    private static double performMultiplication(double num1, double num2) {
        return num1 * num2;
    }

    private static double performSubtraction(double num1, double num2) {
        return num1 - num2;
    }

    private static double performAddition(double num1, double num2) {
        return num1 + num2;
    }
}
