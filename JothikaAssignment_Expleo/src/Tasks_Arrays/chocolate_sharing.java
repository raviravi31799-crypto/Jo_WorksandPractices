//Hard question 1
package Tasks_Arrays;
import java.util.*;
public class chocolate_sharing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of friends:");
		int f=sc.nextInt();
		System.out.println("Chocalates:");
		int []ch=new int[f];
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			sum+=ch[i];
		}
		if(sum%f==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
