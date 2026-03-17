package Practice_Collections;
import java.util.*;
public class priorityqueue {

	public static void main(String[] args) {
		PriorityQueue<String>pq=new PriorityQueue<String>();
		pq.add("c");
		pq.add("b");
		pq.add("a");
		pq.add("e");
		pq.add("f");
		System.out.println("Elements in the queue:"+pq);
		System.out.println("Elements in the queue:");
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		System.out.println("Elements in the queue:"+pq);

	}

}
