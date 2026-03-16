//Easy question 6
package Tasks_Arrays;
import java.util.*;
public class Find_duplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index:");
		int m=sc.nextInt();
		System.out.println("Enter array:");
		int [] arr = new int[m];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate:" +arr[i]);
				}
			}
		}
		
	}

}
