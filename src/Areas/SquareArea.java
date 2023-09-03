import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");

        float sideLength = input.nextFloat();

        input.close();

        float area = sideLength * sideLength;

        System.out.println("The area of the square with side length " + sideLength + " is " + area);
    }
}

