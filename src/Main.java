import java.util.Scanner;

import static Calculator.Calculator.perform;
import static RandomNumber.Generator.randomNumber;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("""
                        What system do you want to use? (type numbers)
                        1- Calculator
                        2- Random Number Game
                        3- Exit
                        Enter:\s""");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> perform();
                    case 2 -> randomNumber();
                    case 3 -> {
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Type a number!");
            }
        }
    }
}