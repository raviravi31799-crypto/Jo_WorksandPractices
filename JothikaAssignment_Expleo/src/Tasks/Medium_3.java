package Tasks;
import java.util.*;
public class Medium_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pages, copies;
        int typingCost, printingCost, totalCost;

        System.out.print("Enter number of pages: ");
        pages = sc.nextInt();

        System.out.print("Enter number of copies: ");
        copies = sc.nextInt();

        
        typingCost = pages * 3;

        
        if (copies >= 1) {
            printingCost = (pages * 5) + (pages * (copies - 1) * 3);
        } else {
            printingCost = 0;
        }

        totalCost = typingCost + printingCost;

        System.out.println("Typing Cost: Rs." + typingCost);
        System.out.println("Printing Cost: Rs." + printingCost);
        System.out.println("Total Bill: Rs." + totalCost);

    }
}