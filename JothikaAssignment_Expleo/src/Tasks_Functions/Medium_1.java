package Tasks_Functions;
import java.util.*;
public class Medium_1 {
static void Range(int x,int y) {
	int even=0,odd=0;
	for(int i=1;i<=1000;i++) {
		if(i%2==0) {
			even+=i;
		}
		}
		
		for(int j=1;j<=1000;j++) {
			if(j%2!=0) {
				odd+=j;
			}
		}
		System.out.println("The sum of even numbers:" +even);
		System.out.println("The sum of odd numbers:" +odd);
		System.out.println("The absolute difference :" +Math.abs(even-odd));
		
	}

	public static void main(String[] args) {
		Range(1,1000);
		
	}

}
