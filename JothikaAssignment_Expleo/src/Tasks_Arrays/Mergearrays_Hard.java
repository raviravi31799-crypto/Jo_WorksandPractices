package Tasks_Arrays;
import java.util.*;
import java.util.Arrays;
public class Mergearrays_Hard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s1:");
		int m=sc.nextInt();
		System.out.println("Enter arr1:");
		int []m1=new int[m];
		for(int i=0;i<m1.length;i++) {
			m1[i]=sc.nextInt();
		}
		System.out.println("Enter s2:");
		int n=sc.nextInt();
		System.out.println("Enter arr2:");
		int []n1=new int[n];
		for(int i=0;i<n1.length;i++) {
			n1[i]=sc.nextInt();
		}
		
		
		int []p1=new int[m+n];
		for(int i=0;i<m;i++) {
			p1[i]=m1[i];
		}
		for(int i=0;i<n;i++) {
			p1[m+i]=n1[i];
		}
		for(int i=0;i<p1.length;i++) {
			System.out.print("Third array:"+p1[i]);
			
		}
		
				}
		
		
		
	}


