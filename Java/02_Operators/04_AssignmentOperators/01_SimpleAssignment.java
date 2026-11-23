import java.util.Scanner;

public class SimpleAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter wallet balance: ₹");
        double balance = sc.nextDouble();

        System.out.println("Your wallet balance is: ₹" + balance);

        sc.close();
    }
}
