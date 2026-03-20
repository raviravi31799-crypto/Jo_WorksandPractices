//Easy_1
package Tasks_Functions;
import java.util.*;
public class Sum_oddeven {
	void Sum_oddeven(int[]arr) {
		int even=0,odd=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				even+=arr[i];
			}
			else {
				odd+=arr[i];
			}
		}
		
		System.out.println("Even:" +even + " Odd:" +odd);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		int []arr=new int [6];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Sum_oddeven sum=new Sum_oddeven();
		sum.Sum_oddeven(arr);
		
			
		
		
	}

}
