package Tasks_Exception;
import java.util.Scanner;

//User-defined Exception
class PayOutOfBoundsException extends Exception {
 public PayOutOfBoundsException(String message) {
     super(message);
 }
}

//Account Management Class
class AccountManagement {

 private double balance = 80000; // initial balance
 private final double MAX_LIMIT = 30000;

 // Method to check conditions before withdrawal
 public void checkForDebit(double amount) throws PayOutOfBoundsException {

     if (amount > MAX_LIMIT) {
         throw new PayOutOfBoundsException("Transaction limit exceeded! Max limit is 30000");
     }

     if (amount > balance) {
         throw new PayOutOfBoundsException("Insufficient balance!");
     }
 }

 // Method to withdraw amount
 public void withdrawAmount(double amount) {
     balance -= amount;
     System.out.println("Withdrawal successful!");
     System.out.println("Remaining Balance: " + balance);
 }
}

//Main Class
public class Question_4 {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     AccountManagement account = new AccountManagement();

     System.out.print("Enter amount to withdraw: ");
     double amount = sc.nextDouble();

     try {
         account.checkForDebit(amount);
         account.withdrawAmount(amount);

     } catch (PayOutOfBoundsException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     sc.close();
 }
}

