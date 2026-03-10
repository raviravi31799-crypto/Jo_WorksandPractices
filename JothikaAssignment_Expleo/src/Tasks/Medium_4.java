package Tasks;
import java.util.*;
public class Medium_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours, minutes;
        int bill = 0;

        System.out.print("Enter browsing hours: ");
        hours = sc.nextInt();

        System.out.print("Enter browsing minutes: ");
        minutes = sc.nextInt();

        if (hours > 7) {
            System.out.println(" Maximum allowed is 7 hours.");
        } 
        else {
            
            if (hours >= 5) {
                bill = 200 + ((hours - 5) * 50) + (minutes * 1);
            } 
            else {
                bill = (hours * 50) + (minutes * 1);
            }

            System.out.println("Total Internet Bill = Rs. " + bill);
        }

       
    }
}
