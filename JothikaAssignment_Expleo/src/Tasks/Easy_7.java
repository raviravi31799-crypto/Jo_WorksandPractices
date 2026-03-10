package Tasks;
import java.util.*;
public class Easy_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter weight:");
		int weight=sc.nextInt();
		if(age>18 && age<55) {
		      if(weight>45) {
				System.out.println("Eligible to donate blood");
		      }
			else {
				System.out.println("Not eligible to donate blood");
			}
		}
		else {
			System.out.println("You are not eligible");
		}
		
		
	}

}
