package Practice_Collections;
import java.util.*;
public class LinkedListdemo {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		System.out.println("Initial size:"+list.size());
		list.add("Java");
		list.add("C++");
		list.add("JavaScript");
		list.add("C#");
		list.add("Kotlin");
		list.add(2,"Python");
		System.out.println("Original LinkedList:"+list);
		System.out.println("Size after adding elements:"+list.size());
		list.remove(5);
		list.remove("C#");
		System.out.println("New Linkedlist:"+list);
		System.out.println("Size after removing elements:"+list.size());
		
		

	}

}
