package Tasks_Collections;
import java.util.*;
public class Question_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashSet<String>set=new LinkedHashSet<String>();
		System.out.println("Enter size :");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++) {
			System.out.println("Elements in the set:");
			String element=sc.nextLine();
			set.add(element);
		}
		String result=" ";
		for(String element:set) {
			result=result + element +" ";
		}
		System.out.println("Concatenated String:"+result);

	}

}
