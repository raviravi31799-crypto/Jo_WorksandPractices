package Tasks_Arrays;
import java.util.*;
import java.util.Arrays;
public class Hard_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[25];
		for(int i=0;i<25;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<25;i++) {
			System.out.println("Array: " +arr[i]);
		}
		for(int i=0;i<25;i++) {
			if(arr[i]%7==0) {
				arr[i]=-2;
		}
			else if(arr[i]%8==0) {
				arr[i]=-9;
			}
			else if(arr[i]%7==0 && arr[i]%8==0) {
				arr[i]=-6;
			}

	}
		for(int i=0;i<25;i++) {
			System.out.println("New array:" +arr[i]);
		}

}
}
