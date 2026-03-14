package Practice_generics;

import java.util.ArrayList;
import java.util.List;

public class upperbound_wildcard {

	public static void main(String[] args) {
		List<Integer>in=new ArrayList<>();
		in.add(6);
		in.add(9);
		in.add(5);
		float sum=sum(in);
		System.out.println("Sum:"+sum);
		}
	public static float sum(List<? extends Number>list) {
		float sum=0;
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		return sum;
	}
	

}
