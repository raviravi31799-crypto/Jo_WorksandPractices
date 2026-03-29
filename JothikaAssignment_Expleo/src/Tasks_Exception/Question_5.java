package Tasks_Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

// Invoice Class
class Invoice {

    private int partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor with validation
    public Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {

        if (partNumber <= 0) {
            throw new IllegalArgumentException("Part number must be greater than 0");
        }

        if (partDescription == null || partDescription.trim().isEmpty()) {
            throw new IllegalArgumentException("Part description cannot be empty");
        }

        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }

        if (pricePerItem <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Method to calculate total invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    // Display method
    public void display() {
        System.out.println("\nInvoice Details:");
        System.out.println("Part Number: " + partNumber);
        System.out.println("Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: " + pricePerItem);
        System.out.println("Total Amount: " + getInvoiceAmount());
    }
}

// Test Application
public class Question_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Part Number: ");
            int partNumber = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Part Description: ");
            String description = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter Price per Item: ");
            double price = sc.nextDouble();

            // Create Invoice object
            Invoice invoice = new Invoice(partNumber, description, quantity, price);

            // Display details
            invoice.display();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type! Please enter correct data type.");

        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }

        sc.close();
    }
}

