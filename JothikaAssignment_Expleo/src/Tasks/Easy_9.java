package Tasks;
import java.util.*;
public class Easy_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int sum=0;
		while(num>=0) {
			int rem=num%10;
			sum+=rem;
			num=num/10;
		}
		System.out.println("Sum: " +sum);
	}

}
