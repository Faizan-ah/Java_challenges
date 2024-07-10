package RandomNumber;

import java.util.Random;
import java.util.Scanner;

public class Generator {
    public static void randomNumber() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = rand.nextInt(max) + min;
        while (true) {
            System.out.println("Guess a number between 1 and 100");
            int guess = Integer.parseInt(scanner.nextLine());
            if (guess == randomNumber) {
                System.out.println("LETS GOO! You got it right!");
                while (true) {
                    System.out.print("Do you want to continue playing? (y/n): ");
                    String continueInput = scanner.nextLine();
                    if (continueInput.equalsIgnoreCase("y")) {
                        break;
                    } else if (continueInput.equalsIgnoreCase("n")) {
                        return;
                    } else {
                        System.out.println("Invalid input. Please enter 'y' or 'n'.");
                    }
                }
            } else if(guess > randomNumber){
                System.out.println("Your guess is a bit high, go lower!");
            } else {
                System.out.println("Your guess is a bit lower, go higher!");
            }
        }
    }
}
