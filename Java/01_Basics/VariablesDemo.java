```java
public class VariablesDemo {

    public static void main(String[] args) {

        String productName = "Wireless Headphones";
        int quantity = 2;
        double price = 1499.50;
        char category = 'E';
        boolean isAvailable = true;

        double totalAmount = quantity * price;

        System.out.println("========== ORDER SUMMARY ==========");

        System.out.println("Product Name : " + productName);
        System.out.println("Category     : " + category);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Unit Price   : Rs. " + price);
        System.out.println("Available    : " + isAvailable);

        System.out.println("-----------------------------------");
        System.out.println("Total Amount : Rs. " + totalAmount);

        System.out.println("===================================");
    }
}
```
