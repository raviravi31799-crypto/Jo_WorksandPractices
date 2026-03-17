package Practice_Collections;
import java.util.*;
public class Stackdemo {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<String>();
		System.out.println("Size of the stack:"+stk.size());
		stk.push("A");
		stk.add("B");
		stk.push("C");
		stk.push("D");
		System.out.println("Elements in stack:"+stk);
		System.out.println("Size of the stack:"+stk.size());
		stk.pop();
		stk.remove(1);
		System.out.println("stack:"+stk);
		System.out.println("Size of the stack:"+stk.size());
		
	}

}
