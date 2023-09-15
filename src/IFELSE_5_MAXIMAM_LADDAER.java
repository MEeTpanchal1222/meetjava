import java.util.Scanner;

public class IFELSE_5_MAXIMAM_LADDAER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short a;
        short b;
        short c;
        short d;
        short e;
        System.out.print("enter the value of A=");
        a = input.nextShort();
        System.out.print("enter the value of B=");
        b = input.nextShort();
        System.out.print("enter the value of C=");
        c = input.nextShort();
        System.out.print("enter the value of D=");
        d = input.nextShort();
        System.out.print("enter the value of E=");
        e = input.nextShort();
        if(a>b && a>c && a>d && a>e)
        {
            System.out.println("a is maximum");
            System.out.println(a);
        }
        else if(b>c && b>a && b>d && b>e)
        {
            System.out.println("b is maximum");
            System.out.println(b);
        }
        else if(c>a && c>b && c>d && c>e)
        {
            System.out.println("c is maximum");
            System.out.println(c);
        }
        else if(d>a && d>b && d>c && d>e)
        {
            System.out.println("d is maximum");
            System.out.println(d);
        }
        else
        {
            System.out.println("e is maximum");
            System.out.println(e);
        }
    }
}
