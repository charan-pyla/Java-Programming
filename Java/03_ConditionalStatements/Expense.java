import java.util.*;

class Expense {
    int id;
    String category;
    double amount;

    Expense(int id, String category, double amount) {
        this.id = id;
        this.category = category;
        this.amount = amount;
    }
}

public class ExpenseTracker {

    static ArrayList<Expense> expenses = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Personal Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Spending");
            System.out.println("4. Search Expense");
            System.out.println("5. Delete Expense");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice;

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:
                    addExpense();
                    break;

                case 2:
                    viewExpenses();
                    break;

                case 3:
                    totalSpending();
                    break;

                case 4:
                    searchExpense();
                    break;

                case 5:
                    deleteExpense();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void addExpense() {
        System.out.print("Enter Expense ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        expenses.add(new Expense(id, category, amount));

        System.out.println("Expense added successfully!");
    }

    public static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found!");
            return;
        }

        System.out.println("\n--- Expense Records ---");
        for (Expense e : expenses) {
            System.out.println("ID: " + e.id + " | " + e.category + " | " + e.amount);
        }
    }

    public static void totalSpending() {
        double total = 0;

        for (Expense e : expenses) {
            total += e.amount;
        }

        System.out.println("Total Spending: " + total);
    }

    public static void searchExpense() {
        System.out.print("Enter Expense ID: ");
        int id = sc.nextInt();

        for (Expense e : expenses) {
            if (e.id == id) {
                System.out.println("Expense Found!");
                System.out.println("Category: " + e.category);
                System.out.println("Amount: " + e.amount);
                return;
            }
        }

        System.out.println("Expense not found!");
    }

    public static void deleteExpense() {
        System.out.print("Enter Expense ID: ");
        int id = sc.nextInt();

        Iterator<Expense> it = expenses.iterator();

        while (it.hasNext()) {
            Expense e = it.next();
            if (e.id == id) {
                it.remove();
                System.out.println("Expense deleted successfully!");
                return;
            }
        }

        System.out.println("Expense not found!");
    }
}