public class BitwiseOR {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        int result = a | b;

        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Bitwise OR Result: " + result);

        System.out.println("Binary of A: " + Integer.toBinaryString(a));
        System.out.println("Binary of B: " + Integer.toBinaryString(b));
        System.out.println("Binary Result: " + Integer.toBinaryString(result));
    }
}
