import java.util.Scanner;

public class LogicalOR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order amount: ");
        double amount = sc.nextDouble();

        System.out.print("Are you a premium member? (yes/no): ");
        String member = sc.next();

        if (amount >= 500 || member.equalsIgnoreCase("yes")) {
            System.out.println("Congratulations! You get free delivery.");
        } else {
            System.out.println("Delivery charges applicable.");
        }

        sc.close();
    }
}
