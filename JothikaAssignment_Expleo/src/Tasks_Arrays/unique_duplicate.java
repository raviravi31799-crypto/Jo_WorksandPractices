//unique 7 duplicate 
package Tasks_Arrays;
import java.util.*;
public class unique_duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index:");
		int m=sc.nextInt();
		System.out.println("Enter array:");
		int [] arr = new int[m];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int c=0,c1=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				c++;
			}
			
			}
			
		}
		c1=((m-1)-c);
		System.out.println("No.of duplicates:" +c + "\nUnique elements:"+c1);

	}

}
