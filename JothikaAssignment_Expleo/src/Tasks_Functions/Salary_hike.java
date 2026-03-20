package Tasks_Functions;
import java.util.*;
public class Salary_hike {
void Salary_hike(double salary, int hike) {
	double new_salary=(salary+(salary*hike/100));
	System.out.println("Salary Hike:"+ new_salary);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Salary:");
		double salary=sc.nextDouble();
		System.out.println("Hike:");
		int hike=sc.nextInt();
		
		Salary_hike Hike=new Salary_hike();
		Hike.Salary_hike(salary,hike);
		
	}

}
