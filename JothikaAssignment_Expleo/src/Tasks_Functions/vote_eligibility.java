package Tasks_Functions;
import java.util.*;
public class vote_eligibility {
static void Eligibility(int age) {
	if(age>=18) {
		System.out.println("Eligible to vote");
	}
	else {
		System.out.println("Not eligible to vote");
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		Eligibility(age);
	}

}
