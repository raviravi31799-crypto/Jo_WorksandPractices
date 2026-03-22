package Tasks_Collections;
import java.util.*;
public class Question_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter size:");
		int size=sc.nextInt();
		sc.nextLine();
		
		System.out.println("How many names to be input?"+size);
		for(int i=1;i<=size;i++) {
			System.out.println("Enter name #"+i+":");
			String name=sc.nextLine();
			list.add(name);
			
		}
		System.out.println("The names with more than 5 characters:");
		for(String name:list) {
		if(name.length()>5) {
			System.out.println(name);
		}
	
		}
	}

}
