import java.util.Scanner;

public class GreaterThanOrEqual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Is first number greater than or equal to second? " + (a >= b));

        sc.close();
    }
}
