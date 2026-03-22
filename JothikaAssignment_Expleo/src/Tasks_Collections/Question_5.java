package Tasks_Collections;
import java.util.*;
public class Question_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> num=new HashSet<Integer>();
		System.out.println("Enter size:");
		int s=sc.nextInt();
		for(int i=0;i<s;i++) {
			System.out.println("Enter a number( or type done to finish):");
			int n=sc.nextInt();
			num.add(n);
			
		}
		TreeSet<Integer> sorted=new TreeSet<Integer>(num);
		System.out.println("Sorted unique elements:"+sorted);
		List<Integer>odd=new ArrayList<Integer>();
		double sum=0;double avg=0;
		for(int n:sorted) {
			sum+=n;
			avg=sum/s;
			if(n%2!=0) {
				odd.add(n);
			}
			
		}
		System.out.println("Average:"+avg);
		System.out.println("Lowest:"+sorted.first());
		System.out.println("Highest:"+sorted.last());
		System.out.println("Odd numbers:"+odd);
		

}
}
