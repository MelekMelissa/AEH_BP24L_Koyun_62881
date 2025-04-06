import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Part 1: The sum of squares calculator");

        System.out.print("Enter lower and upper integer limits: ");
        int lower = input.nextInt();
        int upper = input.nextInt();

        int total = 0;
        for (int i = lower; i <= upper; i++) {
            total += i * i;
        }

        System.out.println("The sum of squares from " + lower + " to " + upper + " is " + total);

        System.out.println("\nPart 2: Simple calculator");

        while (true) {
            System.out.println("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = input.nextDouble();

            System.out.println("Enter operation (+, -, *, /): ");
            String operation = input.next();

            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = input.next();

            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }

        input.close();
    }
}
