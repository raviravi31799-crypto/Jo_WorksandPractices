package Tasks_Collections;
import java.util.*;
public class Question_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int size=sc.nextInt();
		
		System.out.println("Student marks in the HashMap:");
		for(int i=0;i<size;i++) {
			System.out.println("Name:");
			String name=sc.nextLine();
			System.out.println("Marks:");
			int marks=sc.nextInt();
			map.put(name,marks);
			
			}
		
		System.out.println(map);
		for(map.Entry<String,Integer>marks:map.entrySet()) {
			
			

	}

}
	}
