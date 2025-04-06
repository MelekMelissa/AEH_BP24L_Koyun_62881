import java.util.Scanner;

public class myFourthApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ---------------------------
        // Part 1: Sum of Squares
        // ---------------------------
        System.out.println("Part 1: The sum of squares calculator");

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lower = input.nextInt();
            int upper = input.nextInt();

            if (upper <= lower) {
                System.out.println("Done");
                break;
            }

            int total = 0;
            for (int i = lower; i <= upper; i++) {
                total += i * i;
            }

            System.out.println("The sum of the squares from " + (lower * lower) + " to " + (upper * upper) + " is " + total);
        }

        // ---------------------------
        // Part 2: Simple Calculator
        // ---------------------------
        System.out.println("\nPart 2: Simple calculator");

        while (true) {
            // Menü gösteriliyor
            System.out.println("\nCalculator Menu:");
            System.out.println(" + : Add");
            System.out.println(" - : Subtract");
            System.out.println(" * : Multiply");
            System.out.println(" / : Divide");

            // 1. Sayı alınıyor
            System.out.print("Enter first number: ");
            while (!input.hasNextDouble()) {
                System.out.print("Invalid input. Enter a number: ");
                input.next();
            }
            double num1 = input.nextDouble();

            // 2. Sayı alınıyor
            System.out.print("Enter second number: ");
            while (!input.hasNextDouble()) {
                System.out.print("Invalid input. Enter a number: ");
                input.next();
            }
            double num2 = input.nextDouble();

            // İşlem seçimi
            System.out.print("Enter operation (+, -, *, /): ");
            String operation = input.next();

            double result = 0;
            boolean validOperation = true;

            // İşlem yapılması
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
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            // Devam etmek isteniyor mu?
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = input.next();

            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }

        input.close();
    }
}
