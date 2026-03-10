package Tasks;
import java.util.*;
public class Medium_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity:");
		int quantity=sc.nextInt();
		System.out.println("Enter Price:");
		float price=sc.nextFloat();
		float Purchase_Amount = price*quantity;
		float Discount=0;
		if(Purchase_Amount>1000) {
			 Discount= (Purchase_Amount *(0.10f));
		}
		else if(Purchase_Amount<1000){
		     Discount= (Purchase_Amount*(0.05f));
		}
		System.out.printf(" Paid Amount:" + (Purchase_Amount - Discount));
	}

}
