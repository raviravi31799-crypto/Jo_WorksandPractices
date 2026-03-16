//Max Min easy question 3
package Tasks_Arrays;
import java.util.*;
public class Maxmin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index:");
		int m=sc.nextInt();
		System.out.println("Enter array:");
		int [] arr = new int[m];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.print(max);
	}
	

}
