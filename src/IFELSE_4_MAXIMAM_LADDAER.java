import java.util.Scanner;

public class IFELSE_4_MAXIMAM_LADDAER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short a;
        short b;
        short c;
        short d;
        System.out.print("enter the value of A=");
        a = input.nextShort();
        System.out.print("enter the value of B=");
        b = input.nextShort();
        System.out.print("enter the value of C=");
        c = input.nextShort();
        System.out.print("enter the value of D=");
        d = input.nextShort();
        if(a>b && a>c && a>d)
        {
            System.out.println("a is maximum");
        }
        else if(b>c && b>a && b>d)
        {
            System.out.println("b is maximum");
        }
        else if(c>a && c>b && c>d)
        {
            System.out.println("c is maximum");
        }
        else
        {
            System.out.println("d is maximum");
        }
    }
}
