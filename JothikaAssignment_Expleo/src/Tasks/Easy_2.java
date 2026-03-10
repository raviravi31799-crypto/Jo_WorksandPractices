package Tasks;
import java.util.*;
public class Easy_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		if(num%7==0) {
			System.out.println(num+" is divisor of 7");
		}
		else {
			System.out.println(num+" is not a divisor of 7");
			
		}
	}

}
