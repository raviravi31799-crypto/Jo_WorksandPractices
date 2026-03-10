package Tasks;
import java.util.*;
public class Medium_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0) {
			int rem=temp%10;
			int cube=rem*rem*rem;
			sum+=cube;
			temp=temp/10;
		}
		if(num==sum) 
			System.out.println("Given number is Armstrong number");
		
		else 
			System.out.println("Given number is not an Armstrong number");
		
	}

}
