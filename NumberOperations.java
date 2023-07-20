import java.util.Scanner;

public class NumberOperations {
 
    public static int isEven(int number) {
        if (number % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    
    public static int isOdd(int number) {
        if (number % 2 != 0) {
            return 2;
        } else {
            return 1;
        }
    }

   
    public static int getLastDigit(int number) {
        return Math.abs(number % 10);
    }

    
    public static int getSecondLastDigit(int number) {
        number = Math.abs(number);
        if (number < 10) {
            return -1;
        }
        return (number / 10) % 10;
    }

   
    public static int addLastDigits(int input1, int input2) {
        return getLastDigit(input1) + getLastDigit(input2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int number2 = scanner.nextInt();

        System.out.println("Result of isEven: " + isEven(number1));
        System.out.println("Result of isOdd: " + isOdd(number1));
        System.out.println("Last digit of number1: " + getLastDigit(number1));
        System.out.println("Second last digit of number1: " + getSecondLastDigit(number1));
        System.out.println("Last digit of number2: " + getLastDigit(number2));
        System.out.println("Second last digit of number2: " + getSecondLastDigit(number2));
        System.out.println("Sum of last digits of number1 and number2: " + addLastDigits(number1, number2));

        scanner.close();
    }
}

