import java.util.Scanner;

public class Calculation4 {
        public static void main(String[] args) {
            // Create an object to read user input
            Scanner x = new Scanner(System.in);

            // Prompt the user for the first number
            System.out.println("Input first number: ");
            double number1 = x.nextDouble();

            // Prompt the user for the second number
            System.out.println("Input second number: ");
            double number2 = x.nextDouble();

            // Calculate the product of the two numbers
            double total = number1 * number2;

            // Print the result
            System.out.println("Output=" +total);

            // Close the scanner
            x.close();
        }
}

