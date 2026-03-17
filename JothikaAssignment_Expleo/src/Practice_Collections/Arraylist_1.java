package Practice_Collections;
import java.util.*;
public class Arraylist_1 {

	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<Integer>();
		System.out.println("Initial size :"+arr.size());
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println("Array size:"+arr.size());
		System.out.println("Array:"+arr);
		Integer in[]=new Integer[arr.size()];
		in=arr.toArray(in);
		int sum=0;
		for(int i:in) {
			sum+=i;
		}
		System.out.println("Sum:"+sum);
	}

}
