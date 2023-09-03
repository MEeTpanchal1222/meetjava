import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Interest Calculator");

        System.out.print("Enter the principal amount: ");
        float principal = scanner.nextFloat();

        System.out.print("Enter the rate of interest (as a percentage): ");
        float rateOfInterest = scanner.nextFloat();

        System.out.print("Enter the time period (in years): ");
        float timeInYears = scanner.nextFloat();

        float simpleInterest =(float) ((principal * rateOfInterest * timeInYears) / 100.0);

        System.out.println("Simple Interest: " + simpleInterest);

    }
}

