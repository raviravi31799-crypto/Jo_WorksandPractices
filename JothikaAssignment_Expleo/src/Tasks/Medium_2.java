package Tasks;
import java.util.*;
public class Medium_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Quantity Purchased:");
		int quant=sc.nextInt();
		System.out.println("Price:");
		float price=sc.nextFloat();
		float disc=0;
		float cost=price*quant;
		if(quant>500) {
			disc=price*0.15f;
			
			
		}
		System.out.println("Total expenses: " +(cost-disc));
	}

}
