import java.util.Scanner;
public class IFELSE_2_maximam_laddaer
{
 public static void main(String[] args){
     Scanner input  = new Scanner(System.in);
   short a;
   short b;

     System.out.print("enter the value of A=");
     a = input.nextShort();
     System.out.print("enter the value of B=");
     b = input.nextShort();
     if(a>b)
     {
         System.out.println("A is big");
     }
     else
     {
         System.out.print("B is big");
     }



 }
}
