package Tasks;
import java.util.*;
public class Easy_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Name:");
		String name=sc.nextLine();
		System.out.println("Wages:");
		Double wage=sc.nextDouble();
		System.out.println("No.of days:");
		int days=sc.nextInt();
		Double salary=(days*wage);
		System.out.println("Total Salary:"+salary);
		
	}

}
