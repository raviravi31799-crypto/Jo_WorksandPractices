// remove duplicate elements
package Tasks_Arrays;
import java.util.*;
public class Remove_duplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index:");
		int m=sc.nextInt();
		System.out.println("Enter array:");
		int [] arr = new int[m];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int []arr1=new int [10]  ;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				continue;
				arr1[i]=arr[i];
			}
			
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print("New Array:" +arr1[i]);
		}
	}

}
