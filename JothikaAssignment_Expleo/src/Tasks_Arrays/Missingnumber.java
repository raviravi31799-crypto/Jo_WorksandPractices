package Tasks_Arrays;
import java.util.*;
import java.util.Arrays;
public class Missingnumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
	int missing=0;
	int []arr=new int [99];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
			}
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]!=i+1) {
					missing =i+1;
				}
			}
		System.out.println("Missing: " +missing);
		}
	
		

	}


