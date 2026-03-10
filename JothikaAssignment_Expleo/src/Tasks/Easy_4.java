package Tasks;
import java.util.*;
public class Easy_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum =0;
		do {
			sum=sum+num;
			
		}
		while(num!=0);
		num++;
		System.out.print(sum);
		

	}

}
