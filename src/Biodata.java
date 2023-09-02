import java.util.Scanner;
public class Biodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Biodata Form");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        byte age =  scanner.nextByte();
        scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your percentage: ");
        float percentage = scanner.nextFloat();

        System.out.println("\n===== BIODATA =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Percentage: " + percentage);

        scanner.close();
    }
}

