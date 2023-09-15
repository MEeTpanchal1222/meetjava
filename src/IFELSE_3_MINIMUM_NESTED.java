import java.util.Scanner;

public class IFELSE_3_MINIMUM_NESTED {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short a;
        short b;
        short c;
        System.out.print("enter the value of A=");
        a = input.nextShort();
        System.out.print("enter the value of B=");
        b = input.nextShort();
        System.out.print("enter the value of C=");
        c = input.nextShort();

        if(a<b)
        {
            if(a<c)
            {
                System.out.println("A is small ");
            }
            else{
                System.out.println("C is small");
            }
        }
        else {
            if (b < c) {
                System.out.println("B is small");
            } else {
                System.out.println("C is small");
            }
        }
    }
}
