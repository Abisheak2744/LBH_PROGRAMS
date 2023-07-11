import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Program 1: Check if a number is positive, negative, or zero
        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();
        if (number1 > 0) {
            System.out.println("Positive");
        } else if (number1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // Program 2: Find the greater value of two numbers
        System.out.println("Enter the first number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number3 = scanner.nextInt();
        int max = number2 > number3 ? number2 : number3;
        System.out.println("The greater value is: " + max);

        // Program 3: Check if a number is even or odd
        System.out.println("Enter a number: ");
        int number4 = scanner.nextInt();
        if (number4 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Program 4: Check if the sum of two numbers is even or odd
        System.out.println("Enter the first number: ");
        int number5 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number6 = scanner.nextInt();
        int sum = number5 + number6;
        if (sum % 2 == 0) {
            System.out.println("The sum is even");
        } else {
            System.out.println("The sum is odd");
        }
	    // Program 1: Print all numbers from 1 to 100
        System.out.println("Program 1:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Program 2: Print alternate numbers starting from 1 to 99
        System.out.println("\nProgram 2:");
        for (int i = 1; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Program 3: Print alternate numbers starting from 0 to 100
        System.out.println("\nProgram 3:");
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Program 4: Print all numbers backwards from 100 to 0
        System.out.println("\nProgram 4:");
        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Program 5: Print numbers backwards from 100 to 1 by skipping 2 numbers
        System.out.println("\nProgram 5:");
        for (int i = 100; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
	}
