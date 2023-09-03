import java.util.Scanner;

public class Formula2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        float x = scanner.nextFloat();

        System.out.print("Enter the value of y: ");
        float y = scanner.nextFloat();
        scanner.close();
        float result;
        result = (float) Math.pow(x - y, 2);
        System.out.println("(x - y)^2 = " + result);
    }
}

