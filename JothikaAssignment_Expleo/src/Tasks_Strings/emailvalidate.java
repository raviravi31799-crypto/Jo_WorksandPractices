package Tasks_Strings;
import java.util.*;
public class emailvalidate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email:");
		String email=sc.nextLine();
		if(email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {//checks the email pattern
			System.out.println("Valid email");
			
		}
		else {
			System.out.println("Invalid email");
		}
	}

}
