//easy question 4
package Tasks_Arrays;
import java.util.*;
public class elementFrequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int m=sc.nextInt();
		System.out.println("Enter array:");
		int[]arr=new int[m];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int c=0;int i;
		for( i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
		}
		System.out.println(c);
	}

}
