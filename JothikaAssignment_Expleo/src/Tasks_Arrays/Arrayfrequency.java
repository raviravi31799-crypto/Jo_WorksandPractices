//Arrays Medium question 1
package Tasks_Arrays;
import java.util.*;
public class Arrayfrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int m=sc.nextInt();
		System.out.println("Enter array:");
		int [] arr=new int[m];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		
		}
		System.out.println("key:");
		int a=sc.nextInt();
		
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				c++;
			}
		}
		if(c==1)
				System.out.println("True");
				
		else 
				System.out.println("False");
			
		}
		   
		
		
	}


