import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        float length = input.nextFloat();

        System.out.print("Enter the width of the rectangle: ");
        float width = input.nextFloat();
        input.close();
        float area = length * width;
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is " + area);
    }
}

