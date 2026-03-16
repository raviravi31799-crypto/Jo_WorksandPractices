//hard question 2
package Tasks_Arrays;
import java.util.*;
public class Diceroll_Hard {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter turns: ");
		int t=sc.nextInt();
		System.out.println("Arun's chance:");
		int []arr=new int[t];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Naveen's chance:");
		int []arr1=new int[t];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		int c=0,c1=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]>arr1[j]) {
					c++;
				}
				else {
					c1++;
				}
			}
		}
		if(c>c1) {
			System.out.println("Arun Wins!!");
		}
		else {
			System.out.println("Naveen Wins!!");
		}
	}

}
