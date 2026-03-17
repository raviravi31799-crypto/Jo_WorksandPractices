package Practice_Collections;
import java.util.*;
class Task implements Comparable<Task>{
	private String name;
	private int priority;
	public Task(String name,int priority) {
		this.name=name;
		this.priority=priority;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPriority(int priority) {
		this.priority=priority;
	}
	public int getPriority() {
		return priority;
	}
	@Override
	public int compareTo(Task other) {
		return Integer.compare(other.priority,this.priority);
	}
}
public class priorityqueue_1 {

	public static void main(String[] args) {
		PriorityQueue<Task>PriorityQueue=new PriorityQueue<>();
		PriorityQueue.add(new Task("Task 1",3));
		PriorityQueue.add(new Task("Task 2",1));
		PriorityQueue.add(new Task("Task 3",2));
		while(!PriorityQueue.isEmpty()) {
			Task task=PriorityQueue.poll();
			System.out.println("Executing:"+task.getName()+"(Priority:"+task.getPriority()+")");
			
		}

	}

}
