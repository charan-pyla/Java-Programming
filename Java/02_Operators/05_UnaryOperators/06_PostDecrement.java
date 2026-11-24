public class PostDecrement {
    public static void main(String[] args) {

        int tickets = 50;

        System.out.println("Available Tickets: " + tickets);
        System.out.println("Booked Ticket Count: " + (tickets--));
        System.out.println("Remaining Tickets: " + tickets);
    }
}
