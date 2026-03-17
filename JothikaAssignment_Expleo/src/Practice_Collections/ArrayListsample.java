package Practice_Collections;
import java.util.*;
public class ArrayListsample {

	public static void main(String[] args) {
		ArrayList<String>Arr=new ArrayList<String>();
		System.out.println("Initial size :"+Arr.size());
		Arr.add("A");
		Arr.add("G");
		Arr.add("C");
		Arr.add("D");
		Arr.add("E");
		Arr.add("F");
		Arr.add(1,"B");
		System.out.println("After inserting elements size:"+Arr.size());
		System.out.println("Elements in the array:"+Arr);
		Arr.remove("F");
		Arr.remove(3);
		System.out.println("Elements after manipulation:"+Arr);
	}

}
