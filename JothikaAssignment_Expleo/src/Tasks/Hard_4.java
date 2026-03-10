package Tasks;
import java.util.*;
public class Hard_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost:");
		float cost = sc.nextFloat();
		float disc=0;
		
		if(cost<2000) {
			disc=cost*0.05f;
		}
		else if(cost>=2000 && cost<5000) {
			disc=cost*0.25f;
		}
		else if(cost>=5000 && cost<10000) {
			disc=cost*0.35f;
		}
		else {
			disc=cost*0.50f;
		}
		System.out.println("Amount: " + (cost-disc));
	}

}
