package Practice_generics;
class Demo<T>{
	private T t;
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
}
public class addgenerics {

	public static void main(String[] args) {
		Demo<Integer> obj = new Demo<Integer>();
		obj.set(25);
		System.out.println(obj.get());
		
		Demo<String> obj1 = new Demo<String>();
		obj1.set("Generics");
		System.out.println(obj1.get());

	}

}
