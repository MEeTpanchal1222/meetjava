import java.util.Scanner;

public class IFELSE_2_MAXIMAM_NESTED {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte a;
        byte b;

        System.out.print("Enter the number A:");
        a = input.nextByte();
        System.out.print("Enter the number B:");
        b = input.nextByte();
        if(a>b)
        {
            System.out.println("A is maximum");
            System.out.println(a);

        }else {
            System.out.println("B is maximam");
            System.out.println(b);
        }

    }
}
