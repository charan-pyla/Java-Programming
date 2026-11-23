import java.util.Scanner;

public class LogicalAND {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println(a > 10 && b > 10);

        sc.close();
    }
}
