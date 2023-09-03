import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = input.nextFloat();
        input.close();
        float area = (float)(Math.PI * Math.pow(radius, 2));
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}

