public class SwapVariables {
    public static void main(String[] args) {
        byte a = 20;
        byte b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        byte temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

