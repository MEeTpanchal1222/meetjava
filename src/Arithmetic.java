import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short num1, num2, result;

        System.out.print("Enter the first short integer: ");
        num1 = scanner.nextShort();

        System.out.print("Enter the second integer: ");
        num2 = scanner.nextShort();

        result = (short) (num1 + num2);
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);

        result = (short) (num1 - num2);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);

        result = (short) (num1 * num2);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);


        if (num2 != 0) {

            result = (short) (num1 / num2);
            System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }


        if (num2 != 0) {

            result = (short) (num1 % num2);
            System.out.println("Modulo: " + num1 + " % " + num2 + " = " + result);
        } else {
            System.out.println("Modulo by zero is not allowed.");
        }

        scanner.close();
    }
}

