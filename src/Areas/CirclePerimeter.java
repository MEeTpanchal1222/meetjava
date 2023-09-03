import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = input.nextFloat();
        input.close();
        float perimeter = (float) (2 * Math.PI * radius);
        System.out.println("The perimeter of the circle with radius " + radius + " is " + perimeter);
    }
}

