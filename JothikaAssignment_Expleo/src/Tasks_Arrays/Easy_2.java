//Sorting elements in an array
package Tasks_Arrays;
import java.util.*;
public class Easy_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println("Enter array:");
		int [] arr=new int [m];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;i<arr.length;i++) 
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
