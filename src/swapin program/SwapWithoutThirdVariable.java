public class SwapWithoutThirdVariable {
    public static void main(String[] args) {

        byte a = 20;
        byte b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = (byte)(a + b);
        b = (byte)(a - b);
        a = (byte)(a - b);
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

