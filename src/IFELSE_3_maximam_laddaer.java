import java.util.Scanner;

public class IFELSE_3_maximam_laddaer {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        short a;
        short b;
        short c;
        System.out.print("enter the value of A=");
        a = input.nextShort();
        System.out.print("enter the value of B=");
        b = input.nextShort();
        System.out.print("enter the value of C=");
        c = input.nextShort();
        if(a>b && a>c)
        {
            System.out.print(a);
            System.out.println("=A is maximum");
        }
        else if(b>c && b>a)
        {
            System.out.print(b);
            System.out.println("=B is maximum");
        }
        else
        {
            System.out.print(c);
            System.out.println("=C is maximum");
        }
  }
}
