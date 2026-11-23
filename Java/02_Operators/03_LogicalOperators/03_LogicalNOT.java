import java.util.Scanner;

public class LogicalNOT {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Are you logged in? (true/false): ");
        boolean isLoggedIn = sc.nextBoolean();

        if (!isLoggedIn) {
            System.out.println("Please login to continue.");
        } else {
            System.out.println("Welcome! Access granted.");
        }

        sc.close();
    }
}
