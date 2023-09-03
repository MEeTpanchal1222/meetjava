import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base : ");
        float base = input.nextFloat();
        System.out.print("Enter the height: ");
        float height = input.nextFloat();
        input.close();
        float area = (float) ((base * height) / 2.0);
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is " + area);
    }
}

