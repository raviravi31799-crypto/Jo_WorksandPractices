package Tasks;
import java.util.*;
public class Hard_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the car no:");
		int car=sc.nextInt();
		int sum=0;
		if(car>=1000) {
		while(car!=0) {
			int rem=car%10;
			sum+=rem;
			car=car/10;
			}
		if(sum==3 || sum==5 ||sum==7) {
			System.out.println("Lucky Number");
		}
		else {
			System.out.println("Sorry it's not my lucky number");
		}
		}
		else {
			System.out.println(car+ " is not a valid car number");
		}
	
	
		
	}

}
