import java.util.Scanner;

public class Formula1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        float x = input.nextFloat();
        System.out.print("Enter the value of y: ");
        float y = input.nextFloat();
        input.close();
        float result = (float) Math.pow(x + y, 2);
        System.out.println("(x + y)^2 = " + result);
    }
}

