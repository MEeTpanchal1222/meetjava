import java.util.Scanner;

public class Ifelse_minmum
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        byte a;
        byte b;

        System.out.print("Enter the number A:");
        a = input.nextByte();
        System.out.print("Enter the number B:");
        b = input.nextByte();

        if(a<b)
        {
            System.out.println("A is mini");
            System.out.println(a);

        }else
        {
            System.out.println("B is mini");
            System.out.println(b);

        }

    }
}
