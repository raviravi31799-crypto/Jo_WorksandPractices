//Write a program to add even and odd numbers from 1 to 10. Store and display their
//results in two separate arrays.
package Tasks_Arrays;
import java.util.*;
public class Easy_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] even= new int[10];
		int[]odd= new int[10];
		int m=0,n=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				even[m++]=i;
			}
			else {
				odd[n++]=i;
			}
		}
		System.out.println("Even:");
		for(int i=0;i<m;i++) {
			System.out.print(even[i]+ " ");
		}
		System.out.println();
		System.out.println("Odd: ");
		for(int i=0;i<n;i++) {
			System.out.print(odd[i]+ " ");
		}
		
		
		
	}

}
